package com.example.mapper;

import com.example.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {

    Student findmessage(@Param("sid") Integer sid);
}
