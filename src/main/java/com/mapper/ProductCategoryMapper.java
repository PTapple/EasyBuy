package com.mapper;

import com.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {

    List<ProductCategory> findAllOne();

    List<ProductCategory> findAllTwoThree(Integer parentId);

    List<ProductCategory> findAllTwo(Integer parentId);


}
