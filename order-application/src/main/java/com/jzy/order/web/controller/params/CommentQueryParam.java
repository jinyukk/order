package com.jzy.order.web.controller.params;

import com.jzy.order.domain.PageQueryParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jinziyu
 * @date 2020/4/24 22:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CommentQueryParam extends PageQueryParam {
    private Long shopId;
}
