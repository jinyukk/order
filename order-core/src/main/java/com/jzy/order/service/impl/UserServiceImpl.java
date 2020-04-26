package com.jzy.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.jzy.order.db.tables.daos.UserEntityDao;
import com.jzy.order.db.tables.pojos.UserEntity;
import com.jzy.order.enums.AdminEnum;
import com.jzy.order.exception.ServiceException;
import com.jzy.order.exception.ServiceExceptionEnum;
import com.jzy.order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinziyu
 * @date 2020/4/25 0:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEntityDao userEntityDao;

    @Override
    public UserEntity getByUid(String uid) {
        return userEntityDao.fetchOneByUid(uid);
    }

    @Override
    public void checkPermission(String uid, Long shopId) {
        UserEntity userEntity = getByUid(uid);
        if (userEntity.getIsAdmin().equals(AdminEnum.NOT_ADMIN.status)) {
            throw new ServiceException(ServiceExceptionEnum.NO_PERMISSION);
        }
        List<Long> manageShopIdList = JSON.parseArray(userEntity.getManageShopId(), Long.class);
        if (!manageShopIdList.contains(shopId)) {
            throw new ServiceException(ServiceExceptionEnum.NO_PERMISSION);
        }
    }
}
