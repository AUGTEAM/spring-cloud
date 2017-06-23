package com.liuht.mapper;

import com.liuht.entity.OnlineLog;

public interface OnlineLogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(OnlineLog record);

    int insertSelective(OnlineLog record);

    OnlineLog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(OnlineLog record);

    int updateByPrimaryKey(OnlineLog record);
}