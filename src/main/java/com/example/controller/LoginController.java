package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.domain.Login;
import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600) //解决跨域问题
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "login",method = RequestMethod.POST, produces = "text/html; charset=UTF-8") //这个注解默认json iso格式
    @ResponseBody
    public String say(  @RequestBody Login login) throws Exception {
        System.out.println(login);
        Login login1=loginService.findUP(login.getUsername(),login.getPassword());
        System.out.println("login1"+login1);
        if (login1==null){
            return "f";
        }else if (login1.getRoot()!=null){
            return "r";
        }else {
            return "u";
        }

    }
}
