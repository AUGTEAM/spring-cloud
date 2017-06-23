package com.liuht.mapper;

import com.liuht.entity.DataCreate;

public interface DataCreateMapper {
    int insert(DataCreate record);

    int insertSelective(DataCreate record);
}