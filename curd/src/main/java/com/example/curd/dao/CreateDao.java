package com.example.curd.dao;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CreateDao {
//    添加数据
    void create(String data);
}
