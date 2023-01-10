package com.example.springboot2demo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import user.Student;

@Mapper
public interface MapperDemo {
    @Select("select * from person where id= #{id}")
    Student finduserbyid(int id);
}
