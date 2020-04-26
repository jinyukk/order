package com.jzy.order.domain;

import lombok.Data;

/**
 * @author jinziyu
 * @date 2020/4/20 20:52
 */
@Data
public class PageQueryParam {
    private Integer pageNo = 1;
    private Integer pageSize = 10;

    public Integer getOffset() {
        return (pageNo - 1) * pageSize;
    }
}
