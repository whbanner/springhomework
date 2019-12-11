package com.example.services.impl;

import com.example.domain.Student;
import com.example.mapper.StudentMapper;
import com.example.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findmessage(Integer sid) {
        return studentMapper.findmessage(sid);
    }
}
