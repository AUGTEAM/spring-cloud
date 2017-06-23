package com.liuht.mapper;

import com.liuht.entity.AlbumImg;

public interface AlbumImgMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(AlbumImg record);

    int insertSelective(AlbumImg record);

    AlbumImg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(AlbumImg record);

    int updateByPrimaryKey(AlbumImg record);
}