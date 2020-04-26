/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db;


import com.jzy.order.db.tables.Comment;
import com.jzy.order.db.tables.CommentDetail;
import com.jzy.order.db.tables.OrderDetail;
import com.jzy.order.db.tables.Orders;
import com.jzy.order.db.tables.Product;
import com.jzy.order.db.tables.ProductCategory;
import com.jzy.order.db.tables.Shop;
import com.jzy.order.db.tables.User;
import com.jzy.order.db.tables.records.CommentDetailRecord;
import com.jzy.order.db.tables.records.CommentRecord;
import com.jzy.order.db.tables.records.OrderDetailRecord;
import com.jzy.order.db.tables.records.OrdersRecord;
import com.jzy.order.db.tables.records.ProductCategoryRecord;
import com.jzy.order.db.tables.records.ProductRecord;
import com.jzy.order.db.tables.records.ShopRecord;
import com.jzy.order.db.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>order</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CommentRecord, Long> IDENTITY_COMMENT = Identities0.IDENTITY_COMMENT;
    public static final Identity<CommentDetailRecord, Long> IDENTITY_COMMENT_DETAIL = Identities0.IDENTITY_COMMENT_DETAIL;
    public static final Identity<OrderDetailRecord, Long> IDENTITY_ORDER_DETAIL = Identities0.IDENTITY_ORDER_DETAIL;
    public static final Identity<OrdersRecord, Long> IDENTITY_ORDERS = Identities0.IDENTITY_ORDERS;
    public static final Identity<ProductRecord, Long> IDENTITY_PRODUCT = Identities0.IDENTITY_PRODUCT;
    public static final Identity<ProductCategoryRecord, Long> IDENTITY_PRODUCT_CATEGORY = Identities0.IDENTITY_PRODUCT_CATEGORY;
    public static final Identity<ShopRecord, Long> IDENTITY_SHOP = Identities0.IDENTITY_SHOP;
    public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = UniqueKeys0.KEY_COMMENT_PRIMARY;
    public static final UniqueKey<CommentRecord> KEY_COMMENT_UK_ORDER_ID = UniqueKeys0.KEY_COMMENT_UK_ORDER_ID;
    public static final UniqueKey<CommentDetailRecord> KEY_COMMENT_DETAIL_PRIMARY = UniqueKeys0.KEY_COMMENT_DETAIL_PRIMARY;
    public static final UniqueKey<OrderDetailRecord> KEY_ORDER_DETAIL_PRIMARY = UniqueKeys0.KEY_ORDER_DETAIL_PRIMARY;
    public static final UniqueKey<OrdersRecord> KEY_ORDERS_PRIMARY = UniqueKeys0.KEY_ORDERS_PRIMARY;
    public static final UniqueKey<OrdersRecord> KEY_ORDERS_ORDER_ID = UniqueKeys0.KEY_ORDERS_ORDER_ID;
    public static final UniqueKey<ProductRecord> KEY_PRODUCT_PRIMARY = UniqueKeys0.KEY_PRODUCT_PRIMARY;
    public static final UniqueKey<ProductCategoryRecord> KEY_PRODUCT_CATEGORY_PRIMARY = UniqueKeys0.KEY_PRODUCT_CATEGORY_PRIMARY;
    public static final UniqueKey<ShopRecord> KEY_SHOP_PRIMARY = UniqueKeys0.KEY_SHOP_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_UK_UID = UniqueKeys0.KEY_USER_UK_UID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CommentRecord, Long> IDENTITY_COMMENT = Internal.createIdentity(Comment.COMMENT, Comment.COMMENT.ID);
        public static Identity<CommentDetailRecord, Long> IDENTITY_COMMENT_DETAIL = Internal.createIdentity(CommentDetail.COMMENT_DETAIL, CommentDetail.COMMENT_DETAIL.ID);
        public static Identity<OrderDetailRecord, Long> IDENTITY_ORDER_DETAIL = Internal.createIdentity(OrderDetail.ORDER_DETAIL, OrderDetail.ORDER_DETAIL.ID);
        public static Identity<OrdersRecord, Long> IDENTITY_ORDERS = Internal.createIdentity(Orders.ORDERS, Orders.ORDERS.ID);
        public static Identity<ProductRecord, Long> IDENTITY_PRODUCT = Internal.createIdentity(Product.PRODUCT, Product.PRODUCT.ID);
        public static Identity<ProductCategoryRecord, Long> IDENTITY_PRODUCT_CATEGORY = Internal.createIdentity(ProductCategory.PRODUCT_CATEGORY, ProductCategory.PRODUCT_CATEGORY.ID);
        public static Identity<ShopRecord, Long> IDENTITY_SHOP = Internal.createIdentity(Shop.SHOP, Shop.SHOP.ID);
        public static Identity<UserRecord, Long> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = Internal.createUniqueKey(Comment.COMMENT, "KEY_comment_PRIMARY", Comment.COMMENT.ID);
        public static final UniqueKey<CommentRecord> KEY_COMMENT_UK_ORDER_ID = Internal.createUniqueKey(Comment.COMMENT, "KEY_comment_uk_order_id", Comment.COMMENT.ORDER_ID);
        public static final UniqueKey<CommentDetailRecord> KEY_COMMENT_DETAIL_PRIMARY = Internal.createUniqueKey(CommentDetail.COMMENT_DETAIL, "KEY_comment_detail_PRIMARY", CommentDetail.COMMENT_DETAIL.ID);
        public static final UniqueKey<OrderDetailRecord> KEY_ORDER_DETAIL_PRIMARY = Internal.createUniqueKey(OrderDetail.ORDER_DETAIL, "KEY_order_detail_PRIMARY", OrderDetail.ORDER_DETAIL.ID);
        public static final UniqueKey<OrdersRecord> KEY_ORDERS_PRIMARY = Internal.createUniqueKey(Orders.ORDERS, "KEY_orders_PRIMARY", Orders.ORDERS.ID);
        public static final UniqueKey<OrdersRecord> KEY_ORDERS_ORDER_ID = Internal.createUniqueKey(Orders.ORDERS, "KEY_orders_order_id", Orders.ORDERS.ORDER_ID);
        public static final UniqueKey<ProductRecord> KEY_PRODUCT_PRIMARY = Internal.createUniqueKey(Product.PRODUCT, "KEY_product_PRIMARY", Product.PRODUCT.ID);
        public static final UniqueKey<ProductCategoryRecord> KEY_PRODUCT_CATEGORY_PRIMARY = Internal.createUniqueKey(ProductCategory.PRODUCT_CATEGORY, "KEY_product_category_PRIMARY", ProductCategory.PRODUCT_CATEGORY.ID);
        public static final UniqueKey<ShopRecord> KEY_SHOP_PRIMARY = Internal.createUniqueKey(Shop.SHOP, "KEY_shop_PRIMARY", Shop.SHOP.ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_UK_UID = Internal.createUniqueKey(User.USER, "KEY_user_uk_uid", User.USER.UID);
    }
}