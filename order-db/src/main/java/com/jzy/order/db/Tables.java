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

import javax.annotation.Generated;


/**
 * Convenience access to all tables in order
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>order.comment</code>.
     */
    public static final Comment COMMENT = Comment.COMMENT;

    /**
     * The table <code>order.comment_detail</code>.
     */
    public static final CommentDetail COMMENT_DETAIL = CommentDetail.COMMENT_DETAIL;

    /**
     * The table <code>order.order_detail</code>.
     */
    public static final OrderDetail ORDER_DETAIL = OrderDetail.ORDER_DETAIL;

    /**
     * The table <code>order.orders</code>.
     */
    public static final Orders ORDERS = Orders.ORDERS;

    /**
     * The table <code>order.product</code>.
     */
    public static final Product PRODUCT = Product.PRODUCT;

    /**
     * The table <code>order.product_category</code>.
     */
    public static final ProductCategory PRODUCT_CATEGORY = ProductCategory.PRODUCT_CATEGORY;

    /**
     * The table <code>order.shop</code>.
     */
    public static final Shop SHOP = Shop.SHOP;

    /**
     * The table <code>order.user</code>.
     */
    public static final User USER = User.USER;
}
