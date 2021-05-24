package com.service.impl;

import com.entity.Product;
import com.entity.ProductCategory;
import com.mapper.ProductCategoryMapper;
import com.mapper.ProductMapper;
import com.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;

    //列表1级菜单
    @Override
    public List<ProductCategory> findAllOne() {
        return productCategoryMapper.findAllOne();
    }
    //列表2、3级菜单
    @Override
    public List<ProductCategory> findAllTwoThree() {

        List<ProductCategory> findAllOne = findAllOne();
        for (ProductCategory p : findAllOne){
            List<ProductCategory> findAllTwo = productCategoryMapper.findAllTwoThree(p.getId());
            p.setMenu(findAllTwo);
            for (ProductCategory p1 : findAllTwo){
                List<ProductCategory> findAllThree = productCategoryMapper.findAllTwoThree(p1.getId());
                p1.setMenu(findAllThree);
            }
        }
        return findAllOne;
    }


    //图片1、2、3、4级菜单
    @Override
    public List<ProductCategory> findAllTwo() {
        List<ProductCategory> findAllOne1 = findAllOne();
        List<Product> findAllFour;
        for (ProductCategory p : findAllOne1){
            List<ProductCategory> findAllTwo1 = productCategoryMapper.findAllTwoThree(p.getId());
            p.setMenu(findAllTwo1);
            for(ProductCategory p1 : findAllTwo1){
                findAllFour = productMapper.findAllId(p.getId());
                p1.setPhoto(findAllFour);
            }
        }
        return findAllOne1;
    }

    @Override
    public List<Product> findProduct() {
        return productMapper.findProduct();
    }


}
