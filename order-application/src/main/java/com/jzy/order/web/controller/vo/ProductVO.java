package com.jzy.order.web.controller.vo;

import com.jzy.order.db.tables.pojos.ProductCategoryEntity;
import com.jzy.order.db.tables.pojos.ProductEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author jinziyu
 * @date 2020/4/19 22:08
 */
@Data
public class ProductVO {
    private Long productCategoryId;
    private String productCategoryName;
    private List<ProductEntity> productList;

    public static List<ProductVO> build(List<ProductCategoryEntity> productCategoryEntityList, List<ProductEntity> productEntityList) {
        Map<Long, ProductCategoryEntity> categoryId2CategoryEntity = productCategoryEntityList.stream().collect(
                Collectors.toMap(ProductCategoryEntity::getId, entity -> entity));
        Map<Long, List<ProductEntity>> categoryId2ProductEntityList = new HashMap<>(32);
        productEntityList.forEach(productEntity -> {
            Long categoryId = productEntity.getCategoryId();
            if (!categoryId2ProductEntityList.containsKey(categoryId)) {
                List<ProductEntity> list = new ArrayList<>();
                categoryId2ProductEntityList.put(categoryId, list);
            }
            categoryId2ProductEntityList.get(categoryId).add(productEntity);
        });
        List<ProductVO> res = new ArrayList<>();
        for (Map.Entry<Long, List<ProductEntity>> entry : categoryId2ProductEntityList.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                Long categoryId = entry.getKey();
                ProductVO productVO = new ProductVO();
                productVO.setProductCategoryId(categoryId);
                productVO.setProductCategoryName(categoryId2CategoryEntity.get(categoryId).getCategoryName());
                productVO.setProductList(entry.getValue());
                res.add(productVO);
            }
        }
        return res.stream().sorted((o1, o2) -> {
            Integer p1 = categoryId2CategoryEntity.get(o1.getProductCategoryId()).getPriority();
            Integer p2 = categoryId2CategoryEntity.get(o2.getProductCategoryId()).getPriority();
            if (p1.equals(p2)) {
                return 0;
            }
            return p1 > p2 ? -1 : 1;
        }).collect(Collectors.toList());
    }
}
