package com.yinhai.service.impl;

import com.yinhai.entity.UserEntity;
import com.yinhai.mapper.UserMapper;
import com.yinhai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Desc <p></p>
 * Package com.yinhai.service.impl
 * Created by liuht on 2017/6/23.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public UserEntity findOne(Long id) {
        return null;
    }

    @Override
    public void save(UserEntity user) {

    }

    @Override
    public void delete(Long id) {

    }
}
