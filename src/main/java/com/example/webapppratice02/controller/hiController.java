package com.example.webapppratice02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*
Controller注解
给一个请求，希望得到一个页面，用controller注解
*/
public class hiController {
    @GetMapping("/hi")    //路径

    @RequestMapping("/hi")
    public String hi(){
        return "register";   //与resources->templates->register.html的register对应
    }
}
