package com.jzy.order.service.impl;

import com.jzy.order.db.tables.daos.ProductEntityDao;
import com.jzy.order.db.tables.pojos.ProductCategoryEntity;
import com.jzy.order.db.tables.pojos.ProductEntity;
import com.jzy.order.domain.PageQueryParam;
import com.jzy.order.exception.ServiceException;
import com.jzy.order.exception.ServiceExceptionEnum;
import com.jzy.order.repository.ProductDao;
import com.jzy.order.service.ProductCategoryService;
import com.jzy.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinziyu
 * @date 2020/4/19 16:44
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ProductEntityDao productEntityDao;
    @Autowired
    private ProductCategoryService productCategoryService;

    @Override
    public List<ProductEntity> getOnShelvesProductList(Long shopId) {
        return productDao.getOnShelvesProductList(shopId);
    }

    @Override
    public Long getCount(ProductEntity entity) {
        return productDao.getCount(entity);
    }

    @Override
    public List<ProductEntity> getProductList(ProductEntity entity, PageQueryParam param) {
        return productDao.getProductList(entity, param);
    }

    @Override
    public void insertProduct(ProductEntity entity) {
        productEntityDao.insert(entity);
    }

    @Override
    public boolean updateProduct(ProductEntity entity) {
        if (entity.getCategoryId() != null) {
            boolean isExist = productCategoryService.existById(entity.getId(), entity.getShopId());
            if (!isExist) {
                throw new ServiceException(ServiceExceptionEnum.PRODUCT_CATEGORY_NOT_EXIST);
            }
        }
        return productDao.updateProduct(entity);
    }
}
