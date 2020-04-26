/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db.tables.records;


import com.jzy.order.db.tables.Orders;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class OrdersRecord extends UpdatableRecordImpl<OrdersRecord> implements Record10<Long, String, Long, String, String, Long, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1791446318;

    /**
     * Setter for <code>order.orders.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>order.orders.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>order.orders.order_id</code>.
     */
    public void setOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>order.orders.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>order.orders.shop_id</code>.
     */
    public void setShopId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>order.orders.shop_id</code>.
     */
    public Long getShopId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>order.orders.uid</code>.
     */
    public void setUid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>order.orders.uid</code>.
     */
    public String getUid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>order.orders.user_name</code>.
     */
    public void setUserName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>order.orders.user_name</code>.
     */
    public String getUserName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>order.orders.total_money</code>.
     */
    public void setTotalMoney(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>order.orders.total_money</code>.
     */
    public Long getTotalMoney() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>order.orders.remark</code>.
     */
    public void setRemark(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>order.orders.remark</code>.
     */
    public String getRemark() {
        return (String) get(6);
    }

    /**
     * Setter for <code>order.orders.status</code>.
     */
    public void setStatus(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>order.orders.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>order.orders.ctime</code>.
     */
    public void setCtime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>order.orders.ctime</code>.
     */
    public Timestamp getCtime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>order.orders.mtime</code>.
     */
    public void setMtime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>order.orders.mtime</code>.
     */
    public Timestamp getMtime() {
        return (Timestamp) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, Long, String, String, Long, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, Long, String, String, Long, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Orders.ORDERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Orders.ORDERS.ORDER_ID;
    }

    @Override
    public Field<Long> field3() {
        return Orders.ORDERS.SHOP_ID;
    }

    @Override
    public Field<String> field4() {
        return Orders.ORDERS.UID;
    }

    @Override
    public Field<String> field5() {
        return Orders.ORDERS.USER_NAME;
    }

    @Override
    public Field<Long> field6() {
        return Orders.ORDERS.TOTAL_MONEY;
    }

    @Override
    public Field<String> field7() {
        return Orders.ORDERS.REMARK;
    }

    @Override
    public Field<Integer> field8() {
        return Orders.ORDERS.STATUS;
    }

    @Override
    public Field<Timestamp> field9() {
        return Orders.ORDERS.CTIME;
    }

    @Override
    public Field<Timestamp> field10() {
        return Orders.ORDERS.MTIME;
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
    public String component4() {
        return getUid();
    }

    @Override
    public String component5() {
        return getUserName();
    }

    @Override
    public Long component6() {
        return getTotalMoney();
    }

    @Override
    public String component7() {
        return getRemark();
    }

    @Override
    public Integer component8() {
        return getStatus();
    }

    @Override
    public Timestamp component9() {
        return getCtime();
    }

    @Override
    public Timestamp component10() {
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
    public String value4() {
        return getUid();
    }

    @Override
    public String value5() {
        return getUserName();
    }

    @Override
    public Long value6() {
        return getTotalMoney();
    }

    @Override
    public String value7() {
        return getRemark();
    }

    @Override
    public Integer value8() {
        return getStatus();
    }

    @Override
    public Timestamp value9() {
        return getCtime();
    }

    @Override
    public Timestamp value10() {
        return getMtime();
    }

    @Override
    public OrdersRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public OrdersRecord value2(String value) {
        setOrderId(value);
        return this;
    }

    @Override
    public OrdersRecord value3(Long value) {
        setShopId(value);
        return this;
    }

    @Override
    public OrdersRecord value4(String value) {
        setUid(value);
        return this;
    }

    @Override
    public OrdersRecord value5(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public OrdersRecord value6(Long value) {
        setTotalMoney(value);
        return this;
    }

    @Override
    public OrdersRecord value7(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public OrdersRecord value8(Integer value) {
        setStatus(value);
        return this;
    }

    @Override
    public OrdersRecord value9(Timestamp value) {
        setCtime(value);
        return this;
    }

    @Override
    public OrdersRecord value10(Timestamp value) {
        setMtime(value);
        return this;
    }

    @Override
    public OrdersRecord values(Long value1, String value2, Long value3, String value4, String value5, Long value6, String value7, Integer value8, Timestamp value9, Timestamp value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrdersRecord
     */
    public OrdersRecord() {
        super(Orders.ORDERS);
    }

    /**
     * Create a detached, initialised OrdersRecord
     */
    public OrdersRecord(Long id, String orderId, Long shopId, String uid, String userName, Long totalMoney, String remark, Integer status, Timestamp ctime, Timestamp mtime) {
        super(Orders.ORDERS);

        set(0, id);
        set(1, orderId);
        set(2, shopId);
        set(3, uid);
        set(4, userName);
        set(5, totalMoney);
        set(6, remark);
        set(7, status);
        set(8, ctime);
        set(9, mtime);
    }
}