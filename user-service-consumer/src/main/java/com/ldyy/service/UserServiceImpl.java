package com.ldyy.service;

import com.ldyy.domain.User;

import java.util.List;

/**
 * 要想两者之间有联系
 *      1、将服务提供者注册到注册中心（暴露部分）
 *          1）、导入dubbo依赖
 *      2、让服务消费者去注册中心订阅服务提供者提供的服务地址
 *          1)、
 */
public class UserServiceImpl {
    private UserService userService;

    public void init(){
        List<User> list = userService.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.init();
    }
}
