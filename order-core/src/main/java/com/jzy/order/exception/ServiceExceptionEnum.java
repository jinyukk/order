package com.jzy.order.exception;

/**
 * @author jinziyu
 * @date 2020/4/24 21:56
 */
public enum ServiceExceptionEnum {
    PRODUCT_CATEGORY_NOT_EXIST(1, "商品类别不存在"),
    REPEATED_REQUEST(2, "重复请求"),
    NO_PERMISSION(3, "权限不足");

    public final Integer code;
    public final String tip;

    ServiceExceptionEnum(Integer code, String tip) {
        this.code = code;
        this.tip = tip;
    }
}
