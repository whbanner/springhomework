package com.example.services.impl;

import com.example.domain.Login;
import com.example.domain.Manger;
import com.example.mapper.MangerMapper;
import com.example.services.MangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MangerServiceImpl implements MangerService {
    @Autowired
    MangerMapper mangerMapper;


    @Override
    public List<Manger> findSLib() {
        return mangerMapper.findSLib();
    }

    @Override
    public List<Manger> findSClass() {
        return mangerMapper.findSClass();
    }

    @Override
    public List<Manger> findztable() {
        return mangerMapper.findztable();
    }

    @Override
    public void insertclass(Integer sid, String sdate, Integer snumber) {
        mangerMapper.insertclass(sid,sdate,snumber);
    }

    @Override
    public void updatesznumber(Integer sid) {
        mangerMapper.updatesznumber(sid);
    }

    @Override
    public void updategrade(Integer sgrade, Integer sid) {
        mangerMapper.updategrade(sgrade,sid);
    }

    @Override
    public Manger findsztable(Integer sid) {
        return mangerMapper.findsztable(sid);
    }

}
