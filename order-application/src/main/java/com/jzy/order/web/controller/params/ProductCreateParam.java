package com.jzy.order.web.controller.params;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author jinziyu
 * @date 2020/4/19 22:50
 */
@Data
public class ProductCreateParam {
    @NotNull
    private String uid;
    @NotNull
    private Long shopId;
    @NotNull
    private Long categoryId;
    @NotEmpty
    private String productName;
    private String productDesc;
    private String productIcon;
    private String productPic;
    @NotNull
    private Long price;
}
