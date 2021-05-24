package com.service;

import com.entity.Product;
import com.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    List<ProductCategory> findAllOne();

    List<ProductCategory> findAllTwoThree();

    List<ProductCategory> findAllTwo();

    List<Product> findProduct();
}
