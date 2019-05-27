package com.huchx.shj.controller;

import com.huchx.shj.entity.UserEntity;
import com.huchx.shj.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: yd
 * @Date: 2019/5/27 13:29
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAll")
    public List<UserEntity> findAllUser(){
        return userService.findAll();
    }
}
