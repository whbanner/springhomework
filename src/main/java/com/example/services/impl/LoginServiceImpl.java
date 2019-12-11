package com.example.services.impl;

import com.example.domain.Login;
import com.example.mapper.LoginMapper;
import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    public Login findUP(String username,String password) {

        return loginMapper.findUP(username,password);
    }

    @Override
    public String findSname(Integer sid) {
        return loginMapper.findSname(sid);
    }

    @Override
    public Integer findsid(String username) {
        return loginMapper.findsid(username);
    }
}
