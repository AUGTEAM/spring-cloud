package com.liuht.mapper;

import com.liuht.entity.MenuAuth;

public interface MenuAuthMapper {
    int deleteByPrimaryKey(Integer authId);

    int insert(MenuAuth record);

    int insertSelective(MenuAuth record);

    MenuAuth selectByPrimaryKey(Integer authId);

    int updateByPrimaryKeySelective(MenuAuth record);

    int updateByPrimaryKey(MenuAuth record);
}