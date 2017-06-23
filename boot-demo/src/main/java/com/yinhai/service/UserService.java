package com.yinhai.service;

import com.yinhai.entity.UserEntity;

import java.util.List;

/**
 * Desc <p></p>
 * Package com.yinhai.service
 * Created by liuht on 2017/6/23.
 */
public interface UserService {

    List<UserEntity> findAll();

    UserEntity findOne(Long id);

    void save(UserEntity user);

    void delete(Long id);
}
