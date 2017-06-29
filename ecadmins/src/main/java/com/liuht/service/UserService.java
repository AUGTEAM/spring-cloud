package com.liuht.service;


import com.liuht.entity.User;

import java.util.List;

/**
 * Desc <p></p>
 * Package com.liuht.service
 * Created by liuht on 2017/6/23.
 */
public interface UserService {

    List<User> findAll();

    User findOne(Long id);

    void save(User user);

    void delete(Long id);
}
