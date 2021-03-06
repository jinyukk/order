/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db.tables;


import com.jzy.order.db.Indexes;
import com.jzy.order.db.Keys;
import com.jzy.order.db.Order;
import com.jzy.order.db.tables.records.OrderDetailRecord;

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
import org.jooq.Row9;
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
public class OrderDetail extends TableImpl<OrderDetailRecord> {

    private static final long serialVersionUID = 627250070;

    /**
     * The reference instance of <code>order.order_detail</code>
     */
    public static final OrderDetail ORDER_DETAIL = new OrderDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderDetailRecord> getRecordType() {
        return OrderDetailRecord.class;
    }

    /**
     * The column <code>order.order_detail.id</code>.
     */
    public final TableField<OrderDetailRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>order.order_detail.order_id</code>.
     */
    public final TableField<OrderDetailRecord, String> ORDER_ID = createField(DSL.name("order_id"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.order_detail.shop_id</code>.
     */
    public final TableField<OrderDetailRecord, Long> SHOP_ID = createField(DSL.name("shop_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>order.order_detail.product_id</code>.
     */
    public final TableField<OrderDetailRecord, Long> PRODUCT_ID = createField(DSL.name("product_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>order.order_detail.product_name</code>.
     */
    public final TableField<OrderDetailRecord, String> PRODUCT_NAME = createField(DSL.name("product_name"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.order_detail.product_price</code>.
     */
    public final TableField<OrderDetailRecord, Long> PRODUCT_PRICE = createField(DSL.name("product_price"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>order.order_detail.product_quantity</code>.
     */
    public final TableField<OrderDetailRecord, Integer> PRODUCT_QUANTITY = createField(DSL.name("product_quantity"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>order.order_detail.ctime</code>.
     */
    public final TableField<OrderDetailRecord, Timestamp> CTIME = createField(DSL.name("ctime"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>order.order_detail.mtime</code>.
     */
    public final TableField<OrderDetailRecord, Timestamp> MTIME = createField(DSL.name("mtime"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>order.order_detail</code> table reference
     */
    public OrderDetail() {
        this(DSL.name("order_detail"), null);
    }

    /**
     * Create an aliased <code>order.order_detail</code> table reference
     */
    public OrderDetail(String alias) {
        this(DSL.name(alias), ORDER_DETAIL);
    }

    /**
     * Create an aliased <code>order.order_detail</code> table reference
     */
    public OrderDetail(Name alias) {
        this(alias, ORDER_DETAIL);
    }

    private OrderDetail(Name alias, Table<OrderDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderDetail(Name alias, Table<OrderDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OrderDetail(Table<O> child, ForeignKey<O, OrderDetailRecord> key) {
        super(child, key, ORDER_DETAIL);
    }

    @Override
    public Schema getSchema() {
        return Order.ORDER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORDER_DETAIL_ORDER_ID, Indexes.ORDER_DETAIL_PRIMARY, Indexes.ORDER_DETAIL_SHOP_ID_PRODUCT_ID);
    }

    @Override
    public Identity<OrderDetailRecord, Long> getIdentity() {
        return Keys.IDENTITY_ORDER_DETAIL;
    }

    @Override
    public UniqueKey<OrderDetailRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_DETAIL_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrderDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderDetailRecord>>asList(Keys.KEY_ORDER_DETAIL_PRIMARY);
    }

    @Override
    public OrderDetail as(String alias) {
        return new OrderDetail(DSL.name(alias), this);
    }

    @Override
    public OrderDetail as(Name alias) {
        return new OrderDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderDetail rename(String name) {
        return new OrderDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderDetail rename(Name name) {
        return new OrderDetail(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, Long, Long, String, Long, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
