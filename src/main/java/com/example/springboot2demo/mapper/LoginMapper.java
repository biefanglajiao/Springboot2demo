package com.example.springboot2demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import user.LoginUser;

@Mapper
public interface LoginMapper {
    @Select("select * from users where username= #{username} ")
    LoginUser selectuser(String name);
//username= #{username}
}
