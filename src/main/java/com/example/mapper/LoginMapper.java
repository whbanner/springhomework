package com.example.mapper;

import com.example.domain.Login;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {

    Login findUP(@Param("username") String username,@Param("password") String password);

    String findSname(@Param("sid")Integer sid);

    Integer findsid(@Param("username")String username);
}
