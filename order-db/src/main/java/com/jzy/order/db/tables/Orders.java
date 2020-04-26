/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db.tables;


import com.jzy.order.db.Indexes;
import com.jzy.order.db.Keys;
import com.jzy.order.db.Order;
import com.jzy.order.db.tables.records.OrdersRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Orders extends TableImpl<OrdersRecord> {

    private static final long serialVersionUID = -1929231183;

    /**
     * The reference instance of <code>order.orders</code>
     */
    public static final Orders ORDERS = new Orders();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrdersRecord> getRecordType() {
        return OrdersRecord.class;
    }

    /**
     * The column <code>order.orders.id</code>.
     */
    public final TableField<OrdersRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>order.orders.order_id</code>.
     */
    public final TableField<OrdersRecord, String> ORDER_ID = createField(DSL.name("order_id"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.orders.shop_id</code>.
     */
    public final TableField<OrdersRecord, Long> SHOP_ID = createField(DSL.name("shop_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>order.orders.uid</code>.
     */
    public final TableField<OrdersRecord, String> UID = createField(DSL.name("uid"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.orders.user_name</code>.
     */
    public final TableField<OrdersRecord, String> USER_NAME = createField(DSL.name("user_name"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.orders.total_money</code>.
     */
    public final TableField<OrdersRecord, Long> TOTAL_MONEY = createField(DSL.name("total_money"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>order.orders.remark</code>.
     */
    public final TableField<OrdersRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.orders.status</code>.
     */
    public final TableField<OrdersRecord, Integer> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>order.orders.ctime</code>.
     */
    public final TableField<OrdersRecord, Timestamp> CTIME = createField(DSL.name("ctime"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>order.orders.mtime</code>.
     */
    public final TableField<OrdersRecord, Timestamp> MTIME = createField(DSL.name("mtime"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>order.orders</code> table reference
     */
    public Orders() {
        this(DSL.name("orders"), null);
    }

    /**
     * Create an aliased <code>order.orders</code> table reference
     */
    public Orders(String alias) {
        this(DSL.name(alias), ORDERS);
    }

    /**
     * Create an aliased <code>order.orders</code> table reference
     */
    public Orders(Name alias) {
        this(alias, ORDERS);
    }

    private Orders(Name alias, Table<OrdersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Orders(Name alias, Table<OrdersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Orders(Table<O> child, ForeignKey<O, OrdersRecord> key) {
        super(child, key, ORDERS);
    }

    @Override
    public Schema getSchema() {
        return Order.ORDER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORDERS_ORDER_ID, Indexes.ORDERS_PRIMARY, Indexes.ORDERS_SHOP_ID_UID);
    }

    @Override
    public Identity<OrdersRecord, Long> getIdentity() {
        return Keys.IDENTITY_ORDERS;
    }

    @Override
    public UniqueKey<OrdersRecord> getPrimaryKey() {
        return Keys.KEY_ORDERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrdersRecord>> getKeys() {
        return Arrays.<UniqueKey<OrdersRecord>>asList(Keys.KEY_ORDERS_PRIMARY, Keys.KEY_ORDERS_ORDER_ID);
    }

    @Override
    public Orders as(String alias) {
        return new Orders(DSL.name(alias), this);
    }

    @Override
    public Orders as(Name alias) {
        return new Orders(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Orders rename(String name) {
        return new Orders(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Orders rename(Name name) {
        return new Orders(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, Long, String, String, Long, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}