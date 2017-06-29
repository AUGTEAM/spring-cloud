package com.liuht.mapper;

import com.liuht.entity.UserRoles;

public interface UserRolesMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(UserRoles record);

    int insertSelective(UserRoles record);

    UserRoles selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(UserRoles record);

    int updateByPrimaryKey(UserRoles record);
}