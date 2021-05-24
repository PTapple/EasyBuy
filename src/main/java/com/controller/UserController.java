package com.controller;

import com.entity.User;
import com.service.UserService;
import com.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login")
    public RespBean login(@RequestParam(name = "name") String name,@RequestParam(name = "pwd") String pwd){
        User user = userService.login(name,pwd);
        if (user != null){
            return RespBean.success("成功",user);
        }else{
            return RespBean.error("失败");
        }

    }


    @PostMapping(value = "register")
    public RespBean addUser(User user){
        int res = userService.addUser(user);
        if(res>0){
            return RespBean.success("成功");
        }else{
            return RespBean.error("失败");
        }
    }

}
