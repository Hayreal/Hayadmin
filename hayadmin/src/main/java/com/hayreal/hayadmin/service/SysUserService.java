package com.hayreal.hayadmin.service;

import com.hayreal.common.entity.SysUser;

public interface SysUserService {

    /**
     * 通过用户名找到密码
     * @param userName 用户名
     * @param password 密码
     * @return String
     */
    String findPWDbyUserName(String userName,String password);

    /**
     * 注册用户
     * @param sysUser 用户
     * @return String
     */
    String addUser(SysUser sysUser);
}
