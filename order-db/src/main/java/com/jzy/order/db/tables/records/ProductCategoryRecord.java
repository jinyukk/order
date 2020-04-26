/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db.tables.records;


import com.jzy.order.db.tables.ProductCategory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class ProductCategoryRecord extends UpdatableRecordImpl<ProductCategoryRecord> implements Record7<Long, Long, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1921399981;

    /**
     * Setter for <code>order.product_category.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>order.product_category.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>order.product_category.shop_id</code>.
     */
    public void setShopId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>order.product_category.shop_id</code>.
     */
    public Long getShopId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>order.product_category.category_name</code>.
     */
    public void setCategoryName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>order.product_category.category_name</code>.
     */
    public String getCategoryName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>order.product_category.category_desc</code>.
     */
    public void setCategoryDesc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>order.product_category.category_desc</code>.
     */
    public String getCategoryDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>order.product_category.priority</code>.
     */
    public void setPriority(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>order.product_category.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>order.product_category.ctime</code>.
     */
    public void setCtime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>order.product_category.ctime</code>.
     */
    public Timestamp getCtime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>order.product_category.mtime</code>.
     */
    public void setMtime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>order.product_category.mtime</code>.
     */
    public Timestamp getMtime() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ProductCategory.PRODUCT_CATEGORY.ID;
    }

    @Override
    public Field<Long> field2() {
        return ProductCategory.PRODUCT_CATEGORY.SHOP_ID;
    }

    @Override
    public Field<String> field3() {
        return ProductCategory.PRODUCT_CATEGORY.CATEGORY_NAME;
    }

    @Override
    public Field<String> field4() {
        return ProductCategory.PRODUCT_CATEGORY.CATEGORY_DESC;
    }

    @Override
    public Field<Integer> field5() {
        return ProductCategory.PRODUCT_CATEGORY.PRIORITY;
    }

    @Override
    public Field<Timestamp> field6() {
        return ProductCategory.PRODUCT_CATEGORY.CTIME;
    }

    @Override
    public Field<Timestamp> field7() {
        return ProductCategory.PRODUCT_CATEGORY.MTIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getShopId();
    }

    @Override
    public String component3() {
        return getCategoryName();
    }

    @Override
    public String component4() {
        return getCategoryDesc();
    }

    @Override
    public Integer component5() {
        return getPriority();
    }

    @Override
    public Timestamp component6() {
        return getCtime();
    }

    @Override
    public Timestamp component7() {
        return getMtime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getShopId();
    }

    @Override
    public String value3() {
        return getCategoryName();
    }

    @Override
    public String value4() {
        return getCategoryDesc();
    }

    @Override
    public Integer value5() {
        return getPriority();
    }

    @Override
    public Timestamp value6() {
        return getCtime();
    }

    @Override
    public Timestamp value7() {
        return getMtime();
    }

    @Override
    public ProductCategoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ProductCategoryRecord value2(Long value) {
        setShopId(value);
        return this;
    }

    @Override
    public ProductCategoryRecord value3(String value) {
        setCategoryName(value);
        return this;
    }

    @Override
    public ProductCategoryRecord value4(String value) {
        setCategoryDesc(value);
        return this;
    }

    @Override
    public ProductCategoryRecord value5(Integer value) {
        setPriority(value);
        return this;
    }

    @Override
    public ProductCategoryRecord value6(Timestamp value) {
        setCtime(value);
        return this;
    }

    @Override
    public ProductCategoryRecord value7(Timestamp value) {
        setMtime(value);
        return this;
    }

    @Override
    public ProductCategoryRecord values(Long value1, Long value2, String value3, String value4, Integer value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductCategoryRecord
     */
    public ProductCategoryRecord() {
        super(ProductCategory.PRODUCT_CATEGORY);
    }

    /**
     * Create a detached, initialised ProductCategoryRecord
     */
    public ProductCategoryRecord(Long id, Long shopId, String categoryName, String categoryDesc, Integer priority, Timestamp ctime, Timestamp mtime) {
        super(ProductCategory.PRODUCT_CATEGORY);

        set(0, id);
        set(1, shopId);
        set(2, categoryName);
        set(3, categoryDesc);
        set(4, priority);
        set(5, ctime);
        set(6, mtime);
    }
}