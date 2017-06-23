package com.liuht.mapper;

import com.liuht.entity.AppCode;

public interface AppCodeMapper {
    int insert(AppCode record);

    int insertSelective(AppCode record);
}