package com.example.demo_springboot_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CZWGOGO on 2019/10/4 10:02
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("name","thymeleaf");
        return "hello";
    }
}
