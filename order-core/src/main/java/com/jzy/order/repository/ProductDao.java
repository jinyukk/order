package com.jzy.order.repository;

import com.jzy.order.db.tables.pojos.ProductEntity;
import com.jzy.order.domain.PageQueryParam;
import com.jzy.order.enums.ProductStatusEnum;
import org.jooq.DSLContext;
import org.jooq.SelectConditionStep;
import org.jooq.UpdateSetFirstStep;
import org.jooq.UpdateSetMoreStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jzy.order.db.Tables.PRODUCT;

/**
 * @author jinziyu
 * @date 2020/4/19 21:03
 */
@Repository
public class ProductDao {
    @Autowired
    private DSLContext dslContext;

    public List<ProductEntity> getOnShelvesProductList(Long shopId) {
        return dslContext.select().from(PRODUCT)
                .where(PRODUCT.SHOP_ID.eq(shopId)
                        .and(PRODUCT.STATUS.eq(ProductStatusEnum.ON_SHELVES.status)))
                .fetch()
                .into(ProductEntity.class);
    }

    public Long getCount(ProductEntity entity) {
        SelectConditionStep conditionStep = dslContext.selectCount()
                .from(PRODUCT)
                .where(PRODUCT.SHOP_ID.eq(entity.getShopId()));
        if (entity.getCategoryId() != null) {
            conditionStep.and(PRODUCT.CATEGORY_ID.eq(entity.getCategoryId()));
        }
        if (entity.getProductName() != null) {
            conditionStep.and(PRODUCT.PRODUCT_NAME.eq(entity.getProductName()));
        }
        if (entity.getStatus() != null) {
            conditionStep.and(PRODUCT.STATUS.eq(entity.getStatus()));
        }
        return conditionStep.fetchOne().into(Long.class);
    }

    public List<ProductEntity> getProductList(ProductEntity entity, PageQueryParam param) {
        SelectConditionStep conditionStep = dslContext.select()
                .from(PRODUCT)
                .where(PRODUCT.SHOP_ID.eq(entity.getShopId()));
        if (entity.getCategoryId() != null) {
            conditionStep.and(PRODUCT.CATEGORY_ID.eq(entity.getCategoryId()));
        }
        if (entity.getProductName() != null) {
            conditionStep.and(PRODUCT.PRODUCT_NAME.eq(entity.getProductName()));
        }
        if (entity.getStatus() != null) {
            conditionStep.and(PRODUCT.STATUS.eq(entity.getStatus()));
        }
        return conditionStep.orderBy(PRODUCT.ID.desc())
                .limit(param.getOffset(), param.getPageSize())
                .fetch()
                .into(ProductEntity.class);
    }

    public boolean updateProduct(ProductEntity entity) {
        UpdateSetFirstStep step = dslContext.update(PRODUCT);
        UpdateSetMoreStep moreStep = null;
        if (entity.getCategoryId() != null) {
            moreStep = step.set(PRODUCT.CATEGORY_ID, entity.getCategoryId());
        }
        if (entity.getProductName() != null) {
            moreStep = step.set(PRODUCT.PRODUCT_NAME, entity.getProductName());
        }
        if (entity.getProductDesc() != null) {
            moreStep = step.set(PRODUCT.PRODUCT_DESC, entity.getProductDesc());
        }
        if (entity.getProductIcon() != null) {
            moreStep = step.set(PRODUCT.PRODUCT_ICON, entity.getProductIcon());
        }
        if (entity.getProductPic() != null) {
            moreStep = step.set(PRODUCT.PRODUCT_PIC, entity.getProductPic());
        }
        if (entity.getPrice() != null) {
            moreStep = step.set(PRODUCT.PRICE, entity.getPrice());
        }
        if (entity.getStatus() != null) {
            moreStep = step.set(PRODUCT.STATUS, entity.getStatus());
        }
        return moreStep == null || moreStep.where(PRODUCT.ID.eq(entity.getId())).execute() == 1;
    }


}
