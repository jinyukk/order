/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderDetailEntity implements Serializable {

    private static final long serialVersionUID = -439888828;

    private Long      id;
    private String    orderId;
    private Long      shopId;
    private Long      productId;
    private String    productName;
    private Long      productPrice;
    private Integer   productQuantity;
    private Timestamp ctime;
    private Timestamp mtime;

    public OrderDetailEntity() {}

    public OrderDetailEntity(OrderDetailEntity value) {
        this.id = value.id;
        this.orderId = value.orderId;
        this.shopId = value.shopId;
        this.productId = value.productId;
        this.productName = value.productName;
        this.productPrice = value.productPrice;
        this.productQuantity = value.productQuantity;
        this.ctime = value.ctime;
        this.mtime = value.mtime;
    }

    public OrderDetailEntity(
        Long      id,
        String    orderId,
        Long      shopId,
        Long      productId,
        String    productName,
        Long      productPrice,
        Integer   productQuantity,
        Timestamp ctime,
        Timestamp mtime
    ) {
        this.id = id;
        this.orderId = orderId;
        this.shopId = shopId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.ctime = ctime;
        this.mtime = mtime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return this.productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Timestamp getCtime() {
        return this.ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    public Timestamp getMtime() {
        return this.mtime;
    }

    public void setMtime(Timestamp mtime) {
        this.mtime = mtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrderDetailEntity (");

        sb.append(id);
        sb.append(", ").append(orderId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(productId);
        sb.append(", ").append(productName);
        sb.append(", ").append(productPrice);
        sb.append(", ").append(productQuantity);
        sb.append(", ").append(ctime);
        sb.append(", ").append(mtime);

        sb.append(")");
        return sb.toString();
    }
}
