package com.hayreal.hayadmin.controller;

import com.hayreal.common.entity.SysUser;
import com.hayreal.hayadmin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SysUserController {
    @Autowired
    private SysUserService userService;


    /**
     * 登陆功能
     * 1、检查密码是否正确
     * @param userName 用户名
     * @param password 密码
     * @return 是否登陆
     */
    @GetMapping("/login")
    public String login(String userName,String password){
        String flag = userService.findPWDbyUserName(userName, password);

        return flag;
    }

    /**
     * 注册功能
     * 1、用户名是否已存在
     * 2、注册：写入账户名密码
     * @param sysUser 用户
     * @return 是否注册成功
     */
    @PostMapping("/register")
    public String register(SysUser sysUser){
        String flag = userService.addUser(sysUser);
        return flag;
    }
}
