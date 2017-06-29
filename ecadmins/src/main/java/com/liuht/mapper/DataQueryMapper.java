package com.liuht.mapper;

import com.liuht.entity.DataQuery;

public interface DataQueryMapper {
    int insert(DataQuery record);

    int insertSelective(DataQuery record);
}