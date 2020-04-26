package com.jzy.order.web.controller.params;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author jinziyu
 * @date 2020/4/20 19:28
 */
@Data
public class ProductUpdateParam {
    @NotNull
    private String uid;
    @NotNull
    private Long id;
    @NotNull
    private Long shopId;
    private Long categoryId;
    private String productName;
    private String productDesc;
    private String productIcon;
    private String productPic;
    private Long price;
    private Integer status;
}
