package com.jzy.order.repository;

import com.jzy.order.db.tables.daos.OrdersEntityDao;
import com.jzy.order.db.tables.pojos.OrderDetailEntity;
import com.jzy.order.db.tables.pojos.OrdersEntity;
import com.jzy.order.enums.OrderStatusEnum;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.jzy.order.db.Tables.ORDERS;
import static com.jzy.order.db.Tables.ORDER_DETAIL;

/**
 * @author jinziyu
 * @date 2020/4/20 23:59
 */
@Repository
public class OrderDao {
    @Autowired
    private DSLContext dslContext;
    @Autowired
    private OrdersEntityDao ordersEntityDao;

    public Long querySaleOfShop(Long shopId, Timestamp startTime, Timestamp endTime) {
        Long minId = dslContext.select(DSL.max(ORDERS.ID)).from(ORDERS)
                .where(ORDERS.SHOP_ID.eq(shopId))
                .fetchOne()
                .into(Long.class);
        Long maxId = dslContext.select(DSL.max(ORDERS.ID)).from(ORDERS)
                .where(ORDERS.SHOP_ID.eq(shopId))
                .fetchOne()
                .into(Long.class);
        Long res = 0L;
        for (Long id = minId; id < maxId; id++) {
            OrdersEntity entity = ordersEntityDao.fetchOneById(id);
            if (entity != null && entity.getCtime().getTime() >= startTime.getTime()) {
                if (entity.getCtime().getTime() >= endTime.getTime()) {
                    break;
                }
                res += entity.getTotalMoney();
            }
        }
        return res;
    }

    public Integer countSellCountOfProduct(Long shopId, Long productId, Timestamp startTime, Timestamp endTime) {
        Long minId = dslContext.select(DSL.max(ORDERS.ID)).from(ORDERS)
                .where(ORDERS.SHOP_ID.eq(shopId))
                .fetchOne()
                .into(Long.class);
        Long maxId = dslContext.select(DSL.max(ORDERS.ID)).from(ORDERS)
                .where(ORDERS.SHOP_ID.eq(shopId))
                .fetchOne()
                .into(Long.class);
        List<String> orderIdList = new ArrayList<>();
        for (Long id = minId; id < maxId; id++) {
            OrdersEntity entity = ordersEntityDao.fetchOneById(id);
            if (entity != null && entity.getCtime().getTime() >= startTime.getTime()) {
                if (entity.getCtime().getTime() >= endTime.getTime()) {
                    break;
                }
                if (entity.getStatus().equals(OrderStatusEnum.PAYED.status)) {
                    orderIdList.add(entity.getOrderId());
                }
            }
        }
        Integer res = 0;
        for (String orderId : orderIdList) {
            List<OrderDetailEntity> detailEntityList = dslContext.select()
                    .from(ORDER_DETAIL)
                    .where(ORDER_DETAIL.ORDER_ID.eq(orderId))
                    .fetch()
                    .into(OrderDetailEntity.class);
            for (OrderDetailEntity detailEntity : detailEntityList) {
                if (detailEntity.getProductId().equals(productId)) {
                    res += detailEntity.getProductQuantity();
                    break;
                }
            }
        }
        return res;
    }

}
