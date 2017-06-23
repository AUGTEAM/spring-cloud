package com.liuht.mapper;

import com.liuht.entity.Online;

public interface OnlineMapper {
    int insert(Online record);

    int insertSelective(Online record);
}