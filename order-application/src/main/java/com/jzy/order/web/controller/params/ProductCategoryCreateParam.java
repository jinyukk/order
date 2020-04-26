package com.jzy.order.web.controller.params;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author jinziyu
 * @date 2020/4/19 23:11
 */
@Data
public class ProductCategoryCreateParam {
    @NotNull
    private String uid;
    @NotEmpty
    private String categoryName;
    private String categoryDesc;
    private Long priority = 0L;
}
