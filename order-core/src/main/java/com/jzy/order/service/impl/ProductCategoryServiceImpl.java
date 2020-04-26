package com.jzy.order.service.impl;

import com.jzy.order.db.tables.daos.ProductCategoryEntityDao;
import com.jzy.order.db.tables.pojos.ProductCategoryEntity;
import com.jzy.order.service.ProductCategoryService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.jzy.order.db.tables.ProductCategory.PRODUCT_CATEGORY;

/**
 * @author jinziyu
 * @date 2020/4/19 21:35
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private DSLContext dslContext;
    @Autowired
    private ProductCategoryEntityDao productCategoryEntityDao;

    @Override
    public boolean existById(Long id, Long shopId) {
        List<ProductCategoryEntity> res = dslContext.select().from(PRODUCT_CATEGORY)
                .where(PRODUCT_CATEGORY.ID.eq(id)
                        .and(PRODUCT_CATEGORY.SHOP_ID.eq(shopId)))
                .fetch()
                .into(ProductCategoryEntity.class);
        return !res.isEmpty();
    }

    @Override
    public List<ProductCategoryEntity> getListByShopId(Long shopId) {
        return productCategoryEntityDao.fetchByShopId(shopId);
    }

    @Override
    public List<ProductCategoryEntity> getListOrderByPriorityDesc() {
        return dslContext.select().from(PRODUCT_CATEGORY)
                .orderBy(PRODUCT_CATEGORY.PRIORITY.desc())
                .fetch()
                .into(ProductCategoryEntity.class);
    }

    @Override
    public void insertProductCategory(ProductCategoryEntity entity) {
        productCategoryEntityDao.insert(entity);
    }
}
