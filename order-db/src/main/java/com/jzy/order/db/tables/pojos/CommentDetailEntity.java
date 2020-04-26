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
public class CommentDetailEntity implements Serializable {

    private static final long serialVersionUID = -759693933;

    private Long      id;
    private Long      commentId;
    private Long      shopId;
    private Long      productId;
    private String    productName;
    private Integer   score;
    private String    commentContent;
    private Timestamp ctime;
    private Timestamp mtime;

    public CommentDetailEntity() {}

    public CommentDetailEntity(CommentDetailEntity value) {
        this.id = value.id;
        this.commentId = value.commentId;
        this.shopId = value.shopId;
        this.productId = value.productId;
        this.productName = value.productName;
        this.score = value.score;
        this.commentContent = value.commentContent;
        this.ctime = value.ctime;
        this.mtime = value.mtime;
    }

    public CommentDetailEntity(
        Long      id,
        Long      commentId,
        Long      shopId,
        Long      productId,
        String    productName,
        Integer   score,
        String    commentContent,
        Timestamp ctime,
        Timestamp mtime
    ) {
        this.id = id;
        this.commentId = commentId;
        this.shopId = shopId;
        this.productId = productId;
        this.productName = productName;
        this.score = score;
        this.commentContent = commentContent;
        this.ctime = ctime;
        this.mtime = mtime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return this.commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCommentContent() {
        return this.commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
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
        StringBuilder sb = new StringBuilder("CommentDetailEntity (");

        sb.append(id);
        sb.append(", ").append(commentId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(productId);
        sb.append(", ").append(productName);
        sb.append(", ").append(score);
        sb.append(", ").append(commentContent);
        sb.append(", ").append(ctime);
        sb.append(", ").append(mtime);

        sb.append(")");
        return sb.toString();
    }
}
