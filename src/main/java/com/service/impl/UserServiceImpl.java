package com.service.impl;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String name,String pwd){
        return userMapper.login(name,pwd);
    }

    @Override
    public int addUser(User u) {

        return userMapper.addUser(u);
    }

}
