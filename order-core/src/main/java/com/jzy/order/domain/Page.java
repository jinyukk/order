package com.jzy.order.domain;

import lombok.Data;

import java.util.List;

/**
 * @author jinziyu
 * @date 2020/4/20 20:16
 */
@Data
public class Page<T> {
    private Integer pageNo;
    private Integer pageSize = 10;
    private Long totalSize;
    private List<T> list;

    public Page<T> page(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Page<T> pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Page<T> total(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    public Page<T> list(List<T> list) {
        this.list = list;
        return this;
    }
}
