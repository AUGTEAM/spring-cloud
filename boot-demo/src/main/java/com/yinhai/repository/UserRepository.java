package com.yinhai.repository;

import com.yinhai.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Desc <p></p>
 * Package com.yinhai.repository
 * Created by 刘惠涛 on 2017/5/5.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByName(String name);

    UserEntity findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name=:name")
    UserEntity findUser(@Param("name") String name);
}
