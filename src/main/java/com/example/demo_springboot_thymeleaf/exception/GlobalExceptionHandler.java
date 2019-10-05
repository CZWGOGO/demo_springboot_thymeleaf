package com.example.demo_springboot_thymeleaf.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by CZWGOGO on 2019/10/4 15:37
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e)throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",req.getRequestURL());

        mav.setViewName("errorPage");
        return mav;
    }
}
