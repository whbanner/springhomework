package com.example.services;

import com.example.domain.Manger;

import java.util.List;

public interface MangerService {
    List<Manger> findSLib();

    List<Manger> findSClass();

    List<Manger> findztable();

    void insertclass(Integer sid,String sdate,Integer snumber);

    void updatesznumber(Integer sid);

    void updategrade(Integer sgrade,Integer sid);

    Manger findsztable(Integer sid);
}
