package com.example.sp02.controller;

import com.example.sp02.model.Articles;
import com.example.sp02.service.IArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张小锤
 * @site www.xiaomage.com
 * @company xxx公司
 * @create 2023-02-04 8:59
 */
@RestController
@RequestMapping("/articles")
public class Articlescontroller {

    @Autowired
    private IArticlesService articlesService;

    @RequestMapping("/load")
    public Articles load(Integer id){
        Articles a = articlesService.load(id);
        return a;
    }

    @RequestMapping("/get/{id}")
    public Articles get(@PathVariable Integer id){
        Articles a = articlesService.load(id);
        return a;
    }
}
