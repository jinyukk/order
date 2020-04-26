package com.jzy.order.service;

import com.jzy.order.db.tables.pojos.ProductCategoryEntity;

import java.util.List;

/**
 * @author jinziyu
 * @date 2020/4/19 21:33
 */
public interface ProductCategoryService {
    boolean existById(Long id, Long shopId);

    List<ProductCategoryEntity> getListByShopId(Long shopId);

    List<ProductCategoryEntity> getListOrderByPriorityDesc();

    void insertProductCategory(ProductCategoryEntity entity);
}
