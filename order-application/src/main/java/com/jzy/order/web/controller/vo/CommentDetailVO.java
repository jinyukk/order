package com.jzy.order.web.controller.vo;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author jinziyu
 * @date 2020/4/24 22:25
 */
@Data
public class CommentDetailVO {
    private String productName;
    private Integer score;
    private String commentContent;
    private Timestamp ctime;
}
