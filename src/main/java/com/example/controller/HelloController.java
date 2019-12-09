package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.domain.Login;
import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600) //解决跨域问题
@RestController
public class HelloController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("hello")
    @ResponseBody
    public String say( @RequestBody Login login) throws Exception {
        System.out.println("HELLO"+login.getUsername());

        List<Login> list=loginService.findUP();
        System.out.println(list);

        return JSON.toJSONString(list);
    }
}
