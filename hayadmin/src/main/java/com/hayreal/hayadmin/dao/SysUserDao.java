package com.hayreal.hayadmin.dao;

import com.hayreal.common.entity.SysUser;

public interface SysUserDao {
    String findPWDByUserName(String UserName);

    int addUser(SysUser sysUser);
}
