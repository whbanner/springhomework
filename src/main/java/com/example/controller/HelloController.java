package com.example.controller;

import com.example.domain.Login;
import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping()
public class HelloController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("hello")
    public ModelAndView say() {
        ModelAndView modelAndView = new ModelAndView();
        List<Login> list=loginService.findUP();
        modelAndView.setViewName("list");
        modelAndView.addObject("list",list);
        System.out.println(list);

        return modelAndView; //指向hello.jsp
    }
}
