package com.manong.controller;

import com.manong.entity.User;
import com.manong.servrice.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    public List<User> list(){
        return userService.findUserLIst();
    }
}
