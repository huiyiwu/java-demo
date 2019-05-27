package com.huchx.shj.service;

import com.huchx.shj.dao.UserDao;
import com.huchx.shj.entity.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author: yd
 * @Date: 2019/5/27 11:18
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<UserEntity> findAll() {
        return (List<UserEntity>) userDao.findAll();
    }
}
