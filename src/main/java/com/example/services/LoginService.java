package com.example.services;

import com.example.domain.Login;

public interface LoginService {
    Login findUP(String username,String password);

    String findSname(Integer sid);

    Integer findsid(String username);
}
