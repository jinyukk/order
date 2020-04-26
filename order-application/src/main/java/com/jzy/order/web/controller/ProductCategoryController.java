package com.jzy.order.web.controller;

import com.jzy.order.web.controller.params.ProductCategoryCreateParam;
import com.jzy.order.web.controller.vo.Result;
import com.jzy.order.db.tables.pojos.ProductCategoryEntity;
import com.jzy.order.service.ProductCategoryService;
import jodd.bean.BeanCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinziyu
 * @date 2020/4/19 23:09
 */
@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @PostMapping("/insert")
    public Result insertProductCategory(@RequestBody ProductCategoryCreateParam productCategoryCreateParam) {
        ProductCategoryEntity entity = new ProductCategoryEntity();
        BeanCopy.from(productCategoryCreateParam).to(entity).copy();
        productCategoryService.insertProductCategory(entity);
        return Result.success();
    }
}
