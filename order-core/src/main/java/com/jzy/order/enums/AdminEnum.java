package com.jzy.order.enums;

/**
 * @author jinziyu
 * @date 2020/4/20 23:21
 */
public enum  AdminEnum {
    /**
     * 非管理员
     */
    NOT_ADMIN(0, "非管理员"),
    /**
     * 管理员
     */
    ADMIN(1, "管理员");


    public final Integer status;
    public final String statusName;

    AdminEnum(Integer status, String statusName) {
        this.status = status;
        this.statusName = statusName;
    }
}
