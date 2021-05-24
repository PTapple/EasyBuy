package com.controller;

import com.entity.Product;
import com.entity.ProductCategory;
import com.service.ProductCategoryService;
import com.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping(value = "menu")
    public RespBean menu(){

        List<ProductCategory> list = productCategoryService.findAllTwoThree();

        /*List<Map<String,Object>> list = new ArrayList<>();
        List<ProductCategory> one = productCategoryService.findAllOne();
        for (ProductCategory p : one){
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("one",p.getName());
            List<ProductCategory> two = productCategoryService.findAllTwoThree();
            map.put("two",two);
            list.add(map);
            for (ProductCategory p1 : two){
                Map<String,Object> map1 = new HashMap<String, Object>();
                map1.put("two",p.getId());
                List<ProductCategory> three = productCategoryService.findAllTwoThree();
                map.put("three",three);
                list.add(map1);
            }
        }*/
        return RespBean.success("成功",list);

    }

    @RequestMapping(value = "menu1")
    public RespBean menu1(){

        List<ProductCategory> list1 = productCategoryService.findAllTwo();
        return RespBean.success("成功",list1);

    }

    @RequestMapping(value = "querymenu")
    public RespBean querymenu(){
        List<Product> list2 = productCategoryService.findProduct();
        return RespBean.success("成功",list2);

    }

}
