package com.example.curd.controller;


import com.example.curd.service.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateController {

    @Autowired
    CreateService creatService;

    /**
     * postJson json 字符串
     */
    @RequestMapping("create")//Crete 接口
    public String create(@RequestBody String postJson){

        creatService.create(postJson);

        return "Controller";
    }
}
