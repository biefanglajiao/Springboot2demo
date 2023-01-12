package com.example.springboot2demo;

import com.example.springboot2demo.mapper.LoginMapper;
import com.example.springboot2demo.mapper.MapperDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import user.LoginUser;
import user.Student;

import javax.annotation.Resource;
@Slf4j//实现日志打印
@Controller
public class maincontroller {
    @RequestMapping("/aa")
    @ResponseBody
    public String qq (){
        return "heloworld";
    }


    @RequestMapping("/a")
    @ResponseBody
    public Student qq1(){
        Student student=new Student();
        student.setName("czh");
        student.setId(1);
        student.setSex("nan");
        log.info("访问一次/a");
        return student;
    }
    @Resource
    MapperDemo mapper;


    @RequestMapping("/id")
    @ResponseBody
        public Student aa(){
        Student student= mapper.finduserbyid(3);
        return student;

    }
    //    💥一个注解对应一个mapper；写多了 扫描不到 的
    @Resource
    LoginMapper login;
    @RequestMapping("/user")
    @ResponseBody
    public LoginUser aaaa(){
        LoginUser loginUser=login.selectuser("yhf");
        return loginUser;
    }


/**************
 * 返回modelandview的界面   Thymeleaf框架
 */
    @RequestMapping("/login")
    public String qq2(){
    return "login";
    }
}
