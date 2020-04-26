package com.jzy.order.enums;

import lombok.Data;

/**
 * @author jinziyu
 * @date 2020/4/25 2:39
 */
public enum  OrderStatusEnum {
    NOT_PAYED(0, "未支付"),
    PAYED(1, "已支付"),
    CANCELED(2, "已取消")
    ;
    public final Integer status;
    public final String statusName;

    OrderStatusEnum(Integer status, String statusName) {
        this.status = status;
        this.statusName = statusName;
    }
}
