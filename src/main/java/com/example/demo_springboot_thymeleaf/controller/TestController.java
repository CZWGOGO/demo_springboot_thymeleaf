package com.example.demo_springboot_thymeleaf.controller;

import com.example.demo_springboot_thymeleaf.pojo.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CZWGOGO on 2019/10/4 13:28
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Model m){
        String htmlContent="<p style='color:red'>红色文字</p>";
        Product currentProduct=new Product(5,"product e",200);

        m.addAttribute("htmlContent",htmlContent);
        m.addAttribute("currentProduct",currentProduct);

        return "test";
    }

}
