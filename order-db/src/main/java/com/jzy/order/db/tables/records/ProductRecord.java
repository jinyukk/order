/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db.tables.records;


import com.jzy.order.db.tables.Product;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class ProductRecord extends UpdatableRecordImpl<ProductRecord> implements Record16<Long, Long, Long, String, String, String, String, Long, Long, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1091486148;

    /**
     * Setter for <code>order.product.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>order.product.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>order.product.shop_id</code>.
     */
    public void setShopId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>order.product.shop_id</code>.
     */
    public Long getShopId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>order.product.category_id</code>.
     */
    public void setCategoryId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>order.product.category_id</code>.
     */
    public Long getCategoryId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>order.product.product_name</code>.
     */
    public void setProductName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>order.product.product_name</code>.
     */
    public String getProductName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>order.product.product_desc</code>.
     */
    public void setProductDesc(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>order.product.product_desc</code>.
     */
    public String getProductDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>order.product.product_icon</code>.
     */
    public void setProductIcon(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>order.product.product_icon</code>.
     */
    public String getProductIcon() {
        return (String) get(5);
    }

    /**
     * Setter for <code>order.product.product_pic</code>.
     */
    public void setProductPic(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>order.product.product_pic</code>.
     */
    public String getProductPic() {
        return (String) get(6);
    }

    /**
     * Setter for <code>order.product.price</code>.
     */
    public void setPrice(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>order.product.price</code>.
     */
    public Long getPrice() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>order.product.stock</code>.
     */
    public void setStock(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>order.product.stock</code>.
     */
    public Long getStock() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>order.product.status</code>.
     */
    public void setStatus(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>order.product.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>order.product.sell_count_one_week</code>.
     */
    public void setSellCountOneWeek(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>order.product.sell_count_one_week</code>.
     */
    public Integer getSellCountOneWeek() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>order.product.sell_count_one_month</code>.
     */
    public void setSellCountOneMonth(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>order.product.sell_count_one_month</code>.
     */
    public Integer getSellCountOneMonth() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>order.product.rate_count_one_week</code>.
     */
    public void setRateCountOneWeek(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>order.product.rate_count_one_week</code>.
     */
    public Integer getRateCountOneWeek() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>order.product.rate_count_one_month</code>.
     */
    public void setRateCountOneMonth(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>order.product.rate_count_one_month</code>.
     */
    public Integer getRateCountOneMonth() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>order.product.ctime</code>.
     */
    public void setCtime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>order.product.ctime</code>.
     */
    public Timestamp getCtime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>order.product.mtime</code>.
     */
    public void setMtime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>order.product.mtime</code>.
     */
    public Timestamp getMtime() {
        return (Timestamp) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Long, Long, String, String, String, String, Long, Long, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Long, Long, Long, String, String, String, String, Long, Long, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Product.PRODUCT.ID;
    }

    @Override
    public Field<Long> field2() {
        return Product.PRODUCT.SHOP_ID;
    }

    @Override
    public Field<Long> field3() {
        return Product.PRODUCT.CATEGORY_ID;
    }

    @Override
    public Field<String> field4() {
        return Product.PRODUCT.PRODUCT_NAME;
    }

    @Override
    public Field<String> field5() {
        return Product.PRODUCT.PRODUCT_DESC;
    }

    @Override
    public Field<String> field6() {
        return Product.PRODUCT.PRODUCT_ICON;
    }

    @Override
    public Field<String> field7() {
        return Product.PRODUCT.PRODUCT_PIC;
    }

    @Override
    public Field<Long> field8() {
        return Product.PRODUCT.PRICE;
    }

    @Override
    public Field<Long> field9() {
        return Product.PRODUCT.STOCK;
    }

    @Override
    public Field<Integer> field10() {
        return Product.PRODUCT.STATUS;
    }

    @Override
    public Field<Integer> field11() {
        return Product.PRODUCT.SELL_COUNT_ONE_WEEK;
    }

    @Override
    public Field<Integer> field12() {
        return Product.PRODUCT.SELL_COUNT_ONE_MONTH;
    }

    @Override
    public Field<Integer> field13() {
        return Product.PRODUCT.RATE_COUNT_ONE_WEEK;
    }

    @Override
    public Field<Integer> field14() {
        return Product.PRODUCT.RATE_COUNT_ONE_MONTH;
    }

    @Override
    public Field<Timestamp> field15() {
        return Product.PRODUCT.CTIME;
    }

    @Override
    public Field<Timestamp> field16() {
        return Product.PRODUCT.MTIME;
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
    public Long component3() {
        return getCategoryId();
    }

    @Override
    public String component4() {
        return getProductName();
    }

    @Override
    public String component5() {
        return getProductDesc();
    }

    @Override
    public String component6() {
        return getProductIcon();
    }

    @Override
    public String component7() {
        return getProductPic();
    }

    @Override
    public Long component8() {
        return getPrice();
    }

    @Override
    public Long component9() {
        return getStock();
    }

    @Override
    public Integer component10() {
        return getStatus();
    }

    @Override
    public Integer component11() {
        return getSellCountOneWeek();
    }

    @Override
    public Integer component12() {
        return getSellCountOneMonth();
    }

    @Override
    public Integer component13() {
        return getRateCountOneWeek();
    }

    @Override
    public Integer component14() {
        return getRateCountOneMonth();
    }

    @Override
    public Timestamp component15() {
        return getCtime();
    }

    @Override
    public Timestamp component16() {
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
    public Long value3() {
        return getCategoryId();
    }

    @Override
    public String value4() {
        return getProductName();
    }

    @Override
    public String value5() {
        return getProductDesc();
    }

    @Override
    public String value6() {
        return getProductIcon();
    }

    @Override
    public String value7() {
        return getProductPic();
    }

    @Override
    public Long value8() {
        return getPrice();
    }

    @Override
    public Long value9() {
        return getStock();
    }

    @Override
    public Integer value10() {
        return getStatus();
    }

    @Override
    public Integer value11() {
        return getSellCountOneWeek();
    }

    @Override
    public Integer value12() {
        return getSellCountOneMonth();
    }

    @Override
    public Integer value13() {
        return getRateCountOneWeek();
    }

    @Override
    public Integer value14() {
        return getRateCountOneMonth();
    }

    @Override
    public Timestamp value15() {
        return getCtime();
    }

    @Override
    public Timestamp value16() {
        return getMtime();
    }

    @Override
    public ProductRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ProductRecord value2(Long value) {
        setShopId(value);
        return this;
    }

    @Override
    public ProductRecord value3(Long value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public ProductRecord value4(String value) {
        setProductName(value);
        return this;
    }

    @Override
    public ProductRecord value5(String value) {
        setProductDesc(value);
        return this;
    }

    @Override
    public ProductRecord value6(String value) {
        setProductIcon(value);
        return this;
    }

    @Override
    public ProductRecord value7(String value) {
        setProductPic(value);
        return this;
    }

    @Override
    public ProductRecord value8(Long value) {
        setPrice(value);
        return this;
    }

    @Override
    public ProductRecord value9(Long value) {
        setStock(value);
        return this;
    }

    @Override
    public ProductRecord value10(Integer value) {
        setStatus(value);
        return this;
    }

    @Override
    public ProductRecord value11(Integer value) {
        setSellCountOneWeek(value);
        return this;
    }

    @Override
    public ProductRecord value12(Integer value) {
        setSellCountOneMonth(value);
        return this;
    }

    @Override
    public ProductRecord value13(Integer value) {
        setRateCountOneWeek(value);
        return this;
    }

    @Override
    public ProductRecord value14(Integer value) {
        setRateCountOneMonth(value);
        return this;
    }

    @Override
    public ProductRecord value15(Timestamp value) {
        setCtime(value);
        return this;
    }

    @Override
    public ProductRecord value16(Timestamp value) {
        setMtime(value);
        return this;
    }

    @Override
    public ProductRecord values(Long value1, Long value2, Long value3, String value4, String value5, String value6, String value7, Long value8, Long value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Timestamp value15, Timestamp value16) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductRecord
     */
    public ProductRecord() {
        super(Product.PRODUCT);
    }

    /**
     * Create a detached, initialised ProductRecord
     */
    public ProductRecord(Long id, Long shopId, Long categoryId, String productName, String productDesc, String productIcon, String productPic, Long price, Long stock, Integer status, Integer sellCountOneWeek, Integer sellCountOneMonth, Integer rateCountOneWeek, Integer rateCountOneMonth, Timestamp ctime, Timestamp mtime) {
        super(Product.PRODUCT);

        set(0, id);
        set(1, shopId);
        set(2, categoryId);
        set(3, productName);
        set(4, productDesc);
        set(5, productIcon);
        set(6, productPic);
        set(7, price);
        set(8, stock);
        set(9, status);
        set(10, sellCountOneWeek);
        set(11, sellCountOneMonth);
        set(12, rateCountOneWeek);
        set(13, rateCountOneMonth);
        set(14, ctime);
        set(15, mtime);
    }
}
