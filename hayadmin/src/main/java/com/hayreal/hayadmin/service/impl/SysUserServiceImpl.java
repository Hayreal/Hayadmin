package com.hayreal.hayadmin.service.impl;

import com.hayreal.common.entity.SysUser;
import com.hayreal.hayadmin.dao.SysUserDao;
import com.hayreal.hayadmin.service.SysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao userDao;
    @Override
    public String findPWDbyUserName(String userName, String password) {
        String pwd = userDao.findPWDByUserName(userName);
        if (password.equals(pwd)){
            return "登陆成功！";
        }
        return "登陆失败！";
    }

    @Override
    public String addUser(SysUser sysUser) {

        String pwd = userDao.findPWDByUserName(sysUser.getUserName());
        if (!StringUtils.isEmpty(pwd)){
            return "用户名已存在";
        }

        int count = userDao.addUser(sysUser);
        if (count<1){
            return "注册失败";
        }
        return "注册成功";
    }
}
