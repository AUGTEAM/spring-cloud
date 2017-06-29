package com.liuht.entity;

import java.io.Serializable;
import java.util.Date;

public class AlbumImg implements Serializable {
    private Integer imgId;

    private Integer albumId;

    private String imgPath;

    private String imgName;

    private Integer imgSize;

    private Date uploadTime;

    private Integer uploadUser;

    private Byte imgStatus;

    private static final long serialVersionUID = 1L;

    public AlbumImg(Integer imgId, Integer albumId, String imgPath, String imgName, Integer imgSize, Date uploadTime, Integer uploadUser, Byte imgStatus) {
        this.imgId = imgId;
        this.albumId = albumId;
        this.imgPath = imgPath;
        this.imgName = imgName;
        this.imgSize = imgSize;
        this.uploadTime = uploadTime;
        this.uploadUser = uploadUser;
        this.imgStatus = imgStatus;
    }

    public AlbumImg() {
        super();
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }

    public Integer getImgSize() {
        return imgSize;
    }

    public void setImgSize(Integer imgSize) {
        this.imgSize = imgSize;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(Integer uploadUser) {
        this.uploadUser = uploadUser;
    }

    public Byte getImgStatus() {
        return imgStatus;
    }

    public void setImgStatus(Byte imgStatus) {
        this.imgStatus = imgStatus;
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
        AlbumImg other = (AlbumImg) that;
        return (this.getImgId() == null ? other.getImgId() == null : this.getImgId().equals(other.getImgId()))
            && (this.getAlbumId() == null ? other.getAlbumId() == null : this.getAlbumId().equals(other.getAlbumId()))
            && (this.getImgPath() == null ? other.getImgPath() == null : this.getImgPath().equals(other.getImgPath()))
            && (this.getImgName() == null ? other.getImgName() == null : this.getImgName().equals(other.getImgName()))
            && (this.getImgSize() == null ? other.getImgSize() == null : this.getImgSize().equals(other.getImgSize()))
            && (this.getUploadTime() == null ? other.getUploadTime() == null : this.getUploadTime().equals(other.getUploadTime()))
            && (this.getUploadUser() == null ? other.getUploadUser() == null : this.getUploadUser().equals(other.getUploadUser()))
            && (this.getImgStatus() == null ? other.getImgStatus() == null : this.getImgStatus().equals(other.getImgStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getImgId() == null) ? 0 : getImgId().hashCode());
        result = prime * result + ((getAlbumId() == null) ? 0 : getAlbumId().hashCode());
        result = prime * result + ((getImgPath() == null) ? 0 : getImgPath().hashCode());
        result = prime * result + ((getImgName() == null) ? 0 : getImgName().hashCode());
        result = prime * result + ((getImgSize() == null) ? 0 : getImgSize().hashCode());
        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());
        result = prime * result + ((getUploadUser() == null) ? 0 : getUploadUser().hashCode());
        result = prime * result + ((getImgStatus() == null) ? 0 : getImgStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imgId=").append(imgId);
        sb.append(", albumId=").append(albumId);
        sb.append(", imgPath=").append(imgPath);
        sb.append(", imgName=").append(imgName);
        sb.append(", imgSize=").append(imgSize);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", uploadUser=").append(uploadUser);
        sb.append(", imgStatus=").append(imgStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}