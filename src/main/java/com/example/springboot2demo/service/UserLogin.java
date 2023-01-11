package com.example.springboot2demo.service;

import com.example.springboot2demo.mapper.LoginMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import user.LoginUser;

import javax.annotation.Resource;
@Service
public class UserLogin implements UserDetailsService {
    @Resource
    LoginMapper loginMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginUser loginUser =loginMapper.selectuser(username);
        if (loginUser==null)throw new UsernameNotFoundException("用户"+username+"登录失败。查询不到该用户名");
        return User
                .withUsername(loginUser.getUsername())
                .password(loginUser.getUpassword())
                .roles(loginUser.getGroupid())//⛳找到对应的角色对应字段
                .build();

    }
}
