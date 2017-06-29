package com.liuht.mapper;

import com.liuht.entity.DataUpdate;

public interface DataUpdateMapper {
    int insert(DataUpdate record);

    int insertSelective(DataUpdate record);
}