package com.jzy.order.enums;

/**
 * @author jinziyu
 * @date 2020/4/19 21:08
 */
public enum ProductStatusEnum {
    /**
     * 已下架
     */
    OFF_SHELVES(0, "已下架"),
    /**
     * 已上架
     */
    ON_SHELVES(1, "已上架");


    public final Integer status;
    public final String statusName;

    ProductStatusEnum(Integer status, String statusName) {
        this.status = status;
        this.statusName = statusName;
    }
}
