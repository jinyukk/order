package com.jzy.order.repository;

import com.alibaba.fastjson.JSON;
import com.jzy.order.db.tables.daos.UserEntityDao;
import com.jzy.order.db.tables.pojos.UserEntity;
import com.jzy.order.enums.AdminEnum;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.jzy.order.db.tables.User.USER;

/**
 * @author jinziyu
 * @date 2020/4/20 23:17
 */
@Repository
public class UserDao {
    @Autowired
    private DSLContext dslContext;
    @Autowired
    private UserEntityDao userEntityDao;

    /**
     * 任命管理员
     * @param uid
     * @return
     */
    public boolean setAdmin(String uid, Long shopId) {
        UserEntity entity = userEntityDao.fetchOneByUid(uid);
        List<Long> shopIdList = JSON.parseArray(entity.getManageShopId(), Long.class);
        if (shopIdList.isEmpty()) {
            shopIdList.add(shopId);
        } else {
            for (int i = 0; i < shopIdList.size(); i++) {
                if (shopIdList.get(i) < shopId) {
                    shopIdList.add(i, shopId);
                    break;
                }
                if (shopIdList.get(i).equals(shopId)) {
                    break;
                }
            }
        }
        return dslContext.update(USER)
                .set(USER.IS_ADMIN, AdminEnum.ADMIN.status)
                .set(USER.MANAGE_SHOP_ID, JSON.toJSONString(shopIdList))
                .where(USER.UID.eq(uid))
                .execute() == 1;
    }

    /**
     * 取消管理员
     * @param uid
     * @return
     */
    public boolean cancelAdmin(String uid, Long shopId) {
        UserEntity entity = userEntityDao.fetchOneByUid(uid);
        List<Long> shopIdList = JSON.parseArray(entity.getManageShopId(), Long.class);
        List<Long> res = new ArrayList<>();
        if (shopIdList.isEmpty()) {
            return true;
        } else {
            for (int i = 0; i < shopIdList.size(); i++) {
                if (shopIdList.get(i).equals(shopId)) {
                    continue;
                }
                res.add(shopIdList.get(i));
            }
        }
        return dslContext.update(USER)
                .set(USER.IS_ADMIN, AdminEnum.NOT_ADMIN.status)
                .set(USER.MANAGE_SHOP_ID, JSON.toJSONString(res))
                .where(USER.UID.eq(uid))
                .execute() == 1;
    }

}
