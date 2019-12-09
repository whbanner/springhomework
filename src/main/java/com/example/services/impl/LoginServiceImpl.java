package com.example.services.impl;

import com.example.domain.Login;
import com.example.mapper.LoginMapper;
import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    public List<Login> findUP() {

        return loginMapper.findUP();
    }
}
