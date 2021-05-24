package com.controller;

import com.entity.News;
import com.service.NewsService;
import com.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "new1")
    public RespBean new1(){
        List<News> list = newsService.findAll();
        return RespBean.success("成功",list);
    }

}
