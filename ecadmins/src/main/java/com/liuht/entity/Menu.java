package com.liuht.entity;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable {
    private Integer menuId;

    private Integer parentId;

    private String menuName;

    private String menuUrl;

    private String menuIcon;

    private Byte menuStatus;

    private Integer menuCreater;

    private Date menuCreateTime;

    private static final long serialVersionUID = 1L;

    public Menu(Integer menuId, Integer parentId, String menuName, String menuUrl, String menuIcon, Byte menuStatus, Integer menuCreater, Date menuCreateTime) {
        this.menuId = menuId;
        this.parentId = parentId;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuIcon = menuIcon;
        this.menuStatus = menuStatus;
        this.menuCreater = menuCreater;
        this.menuCreateTime = menuCreateTime;
    }

    public Menu() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public Byte getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Byte menuStatus) {
        this.menuStatus = menuStatus;
    }

    public Integer getMenuCreater() {
        return menuCreater;
    }

    public void setMenuCreater(Integer menuCreater) {
        this.menuCreater = menuCreater;
    }

    public Date getMenuCreateTime() {
        return menuCreateTime;
    }

    public void setMenuCreateTime(Date menuCreateTime) {
        this.menuCreateTime = menuCreateTime;
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
        Menu other = (Menu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuUrl() == null ? other.getMenuUrl() == null : this.getMenuUrl().equals(other.getMenuUrl()))
            && (this.getMenuIcon() == null ? other.getMenuIcon() == null : this.getMenuIcon().equals(other.getMenuIcon()))
            && (this.getMenuStatus() == null ? other.getMenuStatus() == null : this.getMenuStatus().equals(other.getMenuStatus()))
            && (this.getMenuCreater() == null ? other.getMenuCreater() == null : this.getMenuCreater().equals(other.getMenuCreater()))
            && (this.getMenuCreateTime() == null ? other.getMenuCreateTime() == null : this.getMenuCreateTime().equals(other.getMenuCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuUrl() == null) ? 0 : getMenuUrl().hashCode());
        result = prime * result + ((getMenuIcon() == null) ? 0 : getMenuIcon().hashCode());
        result = prime * result + ((getMenuStatus() == null) ? 0 : getMenuStatus().hashCode());
        result = prime * result + ((getMenuCreater() == null) ? 0 : getMenuCreater().hashCode());
        result = prime * result + ((getMenuCreateTime() == null) ? 0 : getMenuCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", parentId=").append(parentId);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuUrl=").append(menuUrl);
        sb.append(", menuIcon=").append(menuIcon);
        sb.append(", menuStatus=").append(menuStatus);
        sb.append(", menuCreater=").append(menuCreater);
        sb.append(", menuCreateTime=").append(menuCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}