package com.huchx.shm.controller;

import com.huchx.shm.entity.UserEntity;
import com.huchx.shm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: yd
 * @Date: 2019/5/27 14:07
 * @Version 1.0
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findall")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }
}
