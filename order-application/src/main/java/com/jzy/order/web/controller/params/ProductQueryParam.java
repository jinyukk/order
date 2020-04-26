package com.jzy.order.web.controller.params;

import com.jzy.order.domain.PageQueryParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author jinziyu
 * @date 2020/4/25 0:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductQueryParam extends PageQueryParam {
    @NotEmpty
    private String uid;
    @NotNull
    private Long shopId;
    private Long categoryId;
    private String productName;
    private Integer status;
}
