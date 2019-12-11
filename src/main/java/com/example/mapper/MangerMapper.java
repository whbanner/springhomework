package com.example.mapper;


import com.example.domain.Manger;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MangerMapper {

    List<Manger> findSLib();

    List<Manger> findSClass();

    List<Manger> findztable();

    void insertclass(@Param("sid")Integer sid,@Param("sdate")String sdate,@Param("snumber")Integer snumber);

    void updatesznumber(@Param("sid") Integer sid);

    void updategrade(@Param("sgrade")Integer sgrade, @Param("sid")Integer sid);

    Manger findsztable(@Param("sid")Integer sid);
}
