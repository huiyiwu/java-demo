package com.huchx.shm.service;

import com.huchx.shm.entity.UserEntity;
import com.huchx.shm.mapper.UserEntityMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yd
 * @Date: 2019/5/27 15:03
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    public List<UserEntity> findAll() {
        return userEntityMapper.selectAll();
    }
}
