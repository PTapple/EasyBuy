package com.mapper;

import com.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<Product> findProduct();

    List<Product> findAllId(@Param("categoryLevel1Id") Integer categoryLevel1Id);

}
