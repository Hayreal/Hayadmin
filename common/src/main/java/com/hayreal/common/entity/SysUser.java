package com.hayreal.common.entity;

import com.hayreal.common.base.BaseEntity;
import lombok.Data;

@Data
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 2707469974781371986L;
    private Integer id;

    private String userName;

    private String password;
}
