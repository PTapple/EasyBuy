package com.service;

import com.entity.User;

public interface UserService {

    User login(String name, String pwd);

    int addUser(User u);

}
