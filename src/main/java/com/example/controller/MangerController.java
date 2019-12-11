package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.domain.Manger;
import com.example.services.LoginService;
import com.example.services.MangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600) //解决跨域问题
@RestController
public class MangerController {
    @Autowired
    private MangerService mangerService;

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "rootlib", produces = "text/html; charset=UTF-8") //这个注解默认json iso格式
    @ResponseBody
    public String MangerLib( ) throws Exception {

        List<Manger> list = mangerService.findSLib();
        int len = list.size();
        for(int i= 0;i<len;i++){
            Manger m=list.get(i);
            m.setUsername(loginService.findSname(m.getSid()));
        }

        return JSON.toJSONString(list);


    }
    @RequestMapping(value = "rootclass", produces = "text/html; charset=UTF-8") //这个注解默认json iso格式
    @ResponseBody
    public String MangerClass( ) throws Exception {

    List<Manger> list = mangerService.findSClass();
    int len = list.size();
    for (int i=0;i<len;i++){
        Manger m =list.get(i);
        m.setUsername(loginService.findSname(m.getSid()));
    }
    return JSON.toJSONString(list);

    }
    @RequestMapping(value = "rootsztable", produces = "text/html; charset=UTF-8") //这个注解默认json iso格式
    @ResponseBody
    public String Mangersztable( ) throws Exception {

    List<Manger> list = mangerService.findztable();
        int len = list.size();
        for (int i=0;i<len;i++){
            Manger m =list.get(i);
            m.setUsername(loginService.findSname(m.getSid()));
        }
        System.out.println(JSON.toJSONString(list));
    return JSON.toJSONString(list);
    }

    @RequestMapping(value = "rootinsertclass", produces = "text/html; charset=UTF-8") //这个注解默认json iso格式
    @ResponseBody
    public String insertclass(@RequestBody Manger manger) throws Exception {
        System.out.println("xxx");
        String username = manger.getUsername();
        String sdate= manger.getSdate();
        Integer snumber = manger.getSnumber();
        Integer sid = loginService.findsid(username);
        mangerService.insertclass(sid,sdate,snumber);
        mangerService.updatesznumber(sid);
        //更新成绩
        Manger mm=mangerService.findsztable(sid);
        Integer ssnumber=mm.getSznumber();
        Integer ssztime=mm.getSztime();
        Integer ssgrade = 60-snumber*5+ssztime/10;
        mangerService.updategrade(ssgrade,sid);


        return "ok";

    }
}
