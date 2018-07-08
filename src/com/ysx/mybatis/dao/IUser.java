package com.ysx.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import com.ysx.mybatis.models.User;

public interface IUser {
    @Select("select * from user where id= #{id}")
    public User getUserByID(int id);
}
