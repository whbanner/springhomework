package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.domain.Manger;
import com.example.domain.Student;
import com.example.services.LoginService;
import com.example.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600) //解决跨域问题
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "studentmain",method = RequestMethod.POST) //这个注解默认json iso格式
    @ResponseBody
    public String sayxx(@RequestBody Student student) throws Exception {
        System.out.println("xxxsstudent");
        String username=student.getUsername();
        System.out.println(username);
        Integer sid=loginService.findsid(username);
        Student s=studentService.findmessage(sid);
        s.setUsername(username);

        return JSON.toJSONString(s);
    }

}
