package com.mapper;

import com.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User login(@Param("name") String name, @Param("pwd") String pwd);

    int addUser(User u);

}
