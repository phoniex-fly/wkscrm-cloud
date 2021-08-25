package com.wkscrm.collection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getInfo")
    public String getInfo(){
        return "请求成功";
    }
}
