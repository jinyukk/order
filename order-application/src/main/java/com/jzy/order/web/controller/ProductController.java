package com.jzy.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.jzy.order.db.tables.pojos.UserEntity;
import com.jzy.order.domain.Page;
import com.jzy.order.enums.AdminEnum;
import com.jzy.order.exception.ServiceException;
import com.jzy.order.exception.ServiceExceptionEnum;
import com.jzy.order.service.UserService;
import com.jzy.order.web.controller.params.ProductCreateParam;
import com.jzy.order.web.controller.params.ProductQueryParam;
import com.jzy.order.web.controller.params.ProductUpdateParam;
import com.jzy.order.web.controller.vo.ProductVO;
import com.jzy.order.web.controller.vo.Result;
import com.jzy.order.db.tables.pojos.ProductCategoryEntity;
import com.jzy.order.db.tables.pojos.ProductEntity;
import com.jzy.order.service.ProductCategoryService;
import com.jzy.order.service.ProductService;
import jodd.bean.BeanCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author jinziyu
 * @date 2020/4/19 16:43
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductCategoryService productCategoryService;
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Result getProductVOList(@RequestParam("shopId") Long shopId) {
        List<ProductCategoryEntity> productCategoryEntityList = productCategoryService.getListByShopId(shopId);
        List<ProductEntity> productEntityList = productService.getOnShelvesProductList(shopId);
        return Result.success().withData(ProductVO.build(productCategoryEntityList, productEntityList));
    }

    @PostMapping("/manage/list")
    public Page<ProductEntity> getProductList(@Valid @RequestBody ProductQueryParam param) {
        userService.checkPermission(param.getUid(), param.getShopId());
        ProductEntity entity = new ProductEntity();
        BeanCopy.from(param).to(entity).copy();
        Long count = productService.getCount(entity);
        List<ProductEntity> res = productService.getProductList(entity, param);
        return new Page<ProductEntity>().total(count).page(param.getPageNo()).list(res);
    }


    @PostMapping("/insert")
    public Result insertProduct(@Valid @RequestBody ProductCreateParam productCreateParam) {
        userService.checkPermission(productCreateParam.getUid(), productCreateParam.getShopId());
        ProductEntity entity = new ProductEntity();
        BeanCopy.from(productCreateParam).to(entity).copy();
        productService.insertProduct(entity);
        return Result.success();
    }

    @PostMapping("/update")
    public Result updateProduct(@Valid @RequestBody ProductUpdateParam productUpdateParam) {
        userService.checkPermission(productUpdateParam.getUid(), productUpdateParam.getShopId());
        ProductEntity entity = new ProductEntity();
        BeanCopy.from(productUpdateParam).to(entity).copy();
        return Result.success().withData(productService.updateProduct(entity));
    }

}
