package com.jzy.order.service;

import com.jzy.order.db.tables.pojos.ProductEntity;
import com.jzy.order.domain.PageQueryParam;

import java.util.List;

/**
 * @author jinziyu
 * @date 2020/4/19 16:43
 */
public interface ProductService {
    List<ProductEntity> getOnShelvesProductList(Long shopId);

    Long getCount(ProductEntity entity);

    List<ProductEntity> getProductList(ProductEntity entity, PageQueryParam param);

    void insertProduct(ProductEntity entity);

    boolean updateProduct(ProductEntity entity);
}
