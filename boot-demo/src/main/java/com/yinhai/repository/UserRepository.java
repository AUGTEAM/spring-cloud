package com.yinhai.repository;

import com.yinhai.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Desc <p></p>
 * Package com.yinhai.repository
 * Created by 刘惠涛 on 2017/5/5.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}
