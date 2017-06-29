package com.liuht.mapper;

import com.liuht.entity.DataDelete;

public interface DataDeleteMapper {
    int insert(DataDelete record);

    int insertSelective(DataDelete record);
}