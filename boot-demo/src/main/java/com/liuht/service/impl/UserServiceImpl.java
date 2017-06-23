package com.liuht.service.impl;

import com.liuht.entity.UserEntity;
import com.liuht.mapper.UserMapper;
import com.liuht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Desc <p></p>
 * Package com.liuht.service.impl
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
