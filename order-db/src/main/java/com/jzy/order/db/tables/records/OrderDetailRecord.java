/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db.tables.records;


import com.jzy.order.db.tables.OrderDetail;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OrderDetailRecord extends UpdatableRecordImpl<OrderDetailRecord> implements Record9<Long, String, Long, Long, String, Long, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 224689040;

    /**
     * Setter for <code>order.order_detail.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>order.order_detail.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>order.order_detail.order_id</code>.
     */
    public void setOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>order.order_detail.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>order.order_detail.shop_id</code>.
     */
    public void setShopId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>order.order_detail.shop_id</code>.
     */
    public Long getShopId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>order.order_detail.product_id</code>.
     */
    public void setProductId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>order.order_detail.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>order.order_detail.product_name</code>.
     */
    public void setProductName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>order.order_detail.product_name</code>.
     */
    public String getProductName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>order.order_detail.product_price</code>.
     */
    public void setProductPrice(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>order.order_detail.product_price</code>.
     */
    public Long getProductPrice() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>order.order_detail.product_quantity</code>.
     */
    public void setProductQuantity(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>order.order_detail.product_quantity</code>.
     */
    public Integer getProductQuantity() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>order.order_detail.ctime</code>.
     */
    public void setCtime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>order.order_detail.ctime</code>.
     */
    public Timestamp getCtime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>order.order_detail.mtime</code>.
     */
    public void setMtime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>order.order_detail.mtime</code>.
     */
    public Timestamp getMtime() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, Long, Long, String, Long, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, Long, Long, String, Long, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return OrderDetail.ORDER_DETAIL.ID;
    }

    @Override
    public Field<String> field2() {
        return OrderDetail.ORDER_DETAIL.ORDER_ID;
    }

    @Override
    public Field<Long> field3() {
        return OrderDetail.ORDER_DETAIL.SHOP_ID;
    }

    @Override
    public Field<Long> field4() {
        return OrderDetail.ORDER_DETAIL.PRODUCT_ID;
    }

    @Override
    public Field<String> field5() {
        return OrderDetail.ORDER_DETAIL.PRODUCT_NAME;
    }

    @Override
    public Field<Long> field6() {
        return OrderDetail.ORDER_DETAIL.PRODUCT_PRICE;
    }

    @Override
    public Field<Integer> field7() {
        return OrderDetail.ORDER_DETAIL.PRODUCT_QUANTITY;
    }

    @Override
    public Field<Timestamp> field8() {
        return OrderDetail.ORDER_DETAIL.CTIME;
    }

    @Override
    public Field<Timestamp> field9() {
        return OrderDetail.ORDER_DETAIL.MTIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getOrderId();
    }

    @Override
    public Long component3() {
        return getShopId();
    }

    @Override
    public Long component4() {
        return getProductId();
    }

    @Override
    public String component5() {
        return getProductName();
    }

    @Override
    public Long component6() {
        return getProductPrice();
    }

    @Override
    public Integer component7() {
        return getProductQuantity();
    }

    @Override
    public Timestamp component8() {
        return getCtime();
    }

    @Override
    public Timestamp component9() {
        return getMtime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getOrderId();
    }

    @Override
    public Long value3() {
        return getShopId();
    }

    @Override
    public Long value4() {
        return getProductId();
    }

    @Override
    public String value5() {
        return getProductName();
    }

    @Override
    public Long value6() {
        return getProductPrice();
    }

    @Override
    public Integer value7() {
        return getProductQuantity();
    }

    @Override
    public Timestamp value8() {
        return getCtime();
    }

    @Override
    public Timestamp value9() {
        return getMtime();
    }

    @Override
    public OrderDetailRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public OrderDetailRecord value2(String value) {
        setOrderId(value);
        return this;
    }

    @Override
    public OrderDetailRecord value3(Long value) {
        setShopId(value);
        return this;
    }

    @Override
    public OrderDetailRecord value4(Long value) {
        setProductId(value);
        return this;
    }

    @Override
    public OrderDetailRecord value5(String value) {
        setProductName(value);
        return this;
    }

    @Override
    public OrderDetailRecord value6(Long value) {
        setProductPrice(value);
        return this;
    }

    @Override
    public OrderDetailRecord value7(Integer value) {
        setProductQuantity(value);
        return this;
    }

    @Override
    public OrderDetailRecord value8(Timestamp value) {
        setCtime(value);
        return this;
    }

    @Override
    public OrderDetailRecord value9(Timestamp value) {
        setMtime(value);
        return this;
    }

    @Override
    public OrderDetailRecord values(Long value1, String value2, Long value3, Long value4, String value5, Long value6, Integer value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderDetailRecord
     */
    public OrderDetailRecord() {
        super(OrderDetail.ORDER_DETAIL);
    }

    /**
     * Create a detached, initialised OrderDetailRecord
     */
    public OrderDetailRecord(Long id, String orderId, Long shopId, Long productId, String productName, Long productPrice, Integer productQuantity, Timestamp ctime, Timestamp mtime) {
        super(OrderDetail.ORDER_DETAIL);

        set(0, id);
        set(1, orderId);
        set(2, shopId);
        set(3, productId);
        set(4, productName);
        set(5, productPrice);
        set(6, productQuantity);
        set(7, ctime);
        set(8, mtime);
    }
}
