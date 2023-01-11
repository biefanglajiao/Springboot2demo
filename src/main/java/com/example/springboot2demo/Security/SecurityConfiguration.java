//package com.example.springboot2demo.Security;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//import javax.annotation.Resource;
//
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//
//
//    /******
//     * 本地账户密码实现
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/login").permitAll()//任何人可以访问登陆页面
//                .anyRequest().hasRole("user")//只有拥有user校色的人才能访问其他页面
//                .and()
//                .formLogin()//表单登录
//                .defaultSuccessUrl("/a",true);//请求重定向；
//     /*****当第二个参数为true时，当我们登陆认证成功后，即使是之前访问过需要认证的路径，
//      * 这个时候也会直接调整到配置的重定向路径上，如果第二个参数为false时，如果之前访问了需要认证的路径
//      * ，认证成功后就会重定向到之前访问的需要认证的路径上。
//      * 所以一般为true  不然容易404
//      * **/
//
////                .and()
////                .csrf().disable();//关闭csrf
//
//
//    }
//
//
//}
////默认引入类就可以自动实现   也可以通过这个方法实现
////有个5.7写法  不会。。。。。。。。。。。。。。。。。。。。。。。。。
//
//
