package com.jian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther JianLinWei
 * @date 2019/8/5 17:15
 */
@RestController
@RequestMapping("/test")
public class TestClient1Controller {


    @RequestMapping("/get")
    public  String  get(String  str){
        return "输入了"+str ;
    }
}
