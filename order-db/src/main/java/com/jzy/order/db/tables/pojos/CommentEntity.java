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
public class CommentEntity implements Serializable {

    private static final long serialVersionUID = -1164237818;

    private Long      id;
    private String    orderId;
    private Long      shopId;
    private String    uid;
    private Integer   allScore;
    private String    briefComment;
    private Timestamp ctime;
    private Timestamp mtime;

    public CommentEntity() {}

    public CommentEntity(CommentEntity value) {
        this.id = value.id;
        this.orderId = value.orderId;
        this.shopId = value.shopId;
        this.uid = value.uid;
        this.allScore = value.allScore;
        this.briefComment = value.briefComment;
        this.ctime = value.ctime;
        this.mtime = value.mtime;
    }

    public CommentEntity(
        Long      id,
        String    orderId,
        Long      shopId,
        String    uid,
        Integer   allScore,
        String    briefComment,
        Timestamp ctime,
        Timestamp mtime
    ) {
        this.id = id;
        this.orderId = orderId;
        this.shopId = shopId;
        this.uid = uid;
        this.allScore = allScore;
        this.briefComment = briefComment;
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

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getAllScore() {
        return this.allScore;
    }

    public void setAllScore(Integer allScore) {
        this.allScore = allScore;
    }

    public String getBriefComment() {
        return this.briefComment;
    }

    public void setBriefComment(String briefComment) {
        this.briefComment = briefComment;
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
        StringBuilder sb = new StringBuilder("CommentEntity (");

        sb.append(id);
        sb.append(", ").append(orderId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(uid);
        sb.append(", ").append(allScore);
        sb.append(", ").append(briefComment);
        sb.append(", ").append(ctime);
        sb.append(", ").append(mtime);

        sb.append(")");
        return sb.toString();
    }
}
