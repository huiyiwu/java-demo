package com.huchx.shj.dao;

import com.huchx.shj.entity.UserEntity;

import org.springframework.data.repository.CrudRepository;

/**
 * @Author: yd
 * @Date: 2019/5/27 11:17
 * @Version 1.0
 */
public interface UserDao extends CrudRepository<UserEntity,Integer> {
}
