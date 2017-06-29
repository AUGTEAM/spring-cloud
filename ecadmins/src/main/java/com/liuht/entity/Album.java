package com.liuht.entity;

import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private Integer albumId;

    private String albumName;

    private Integer albumCover;

    private Byte albumType;

    private Date createTime;

    private Integer createUser;

    private String createUserName;

    private Byte albumStatus;

    private static final long serialVersionUID = 1L;

    public Album(Integer albumId, String albumName, Integer albumCover, Byte albumType, Date createTime, Integer createUser, String createUserName, Byte albumStatus) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.albumCover = albumCover;
        this.albumType = albumType;
        this.createTime = createTime;
        this.createUser = createUser;
        this.createUserName = createUserName;
        this.albumStatus = albumStatus;
    }

    public Album() {
        super();
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName == null ? null : albumName.trim();
    }

    public Integer getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(Integer albumCover) {
        this.albumCover = albumCover;
    }

    public Byte getAlbumType() {
        return albumType;
    }

    public void setAlbumType(Byte albumType) {
        this.albumType = albumType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Byte getAlbumStatus() {
        return albumStatus;
    }

    public void setAlbumStatus(Byte albumStatus) {
        this.albumStatus = albumStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Album other = (Album) that;
        return (this.getAlbumId() == null ? other.getAlbumId() == null : this.getAlbumId().equals(other.getAlbumId()))
            && (this.getAlbumName() == null ? other.getAlbumName() == null : this.getAlbumName().equals(other.getAlbumName()))
            && (this.getAlbumCover() == null ? other.getAlbumCover() == null : this.getAlbumCover().equals(other.getAlbumCover()))
            && (this.getAlbumType() == null ? other.getAlbumType() == null : this.getAlbumType().equals(other.getAlbumType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateUserName() == null ? other.getCreateUserName() == null : this.getCreateUserName().equals(other.getCreateUserName()))
            && (this.getAlbumStatus() == null ? other.getAlbumStatus() == null : this.getAlbumStatus().equals(other.getAlbumStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAlbumId() == null) ? 0 : getAlbumId().hashCode());
        result = prime * result + ((getAlbumName() == null) ? 0 : getAlbumName().hashCode());
        result = prime * result + ((getAlbumCover() == null) ? 0 : getAlbumCover().hashCode());
        result = prime * result + ((getAlbumType() == null) ? 0 : getAlbumType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateUserName() == null) ? 0 : getCreateUserName().hashCode());
        result = prime * result + ((getAlbumStatus() == null) ? 0 : getAlbumStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", albumId=").append(albumId);
        sb.append(", albumName=").append(albumName);
        sb.append(", albumCover=").append(albumCover);
        sb.append(", albumType=").append(albumType);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", albumStatus=").append(albumStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}