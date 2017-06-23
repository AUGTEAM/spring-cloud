package com.liuht.entity;

import java.io.Serializable;

public class MenuAuth implements Serializable {
    private Integer authId;

    private Integer roleId;

    private Integer menuId;

    private Byte roleCreate;

    private Byte roleQuery;

    private Byte roleUpdate;

    private Byte roleDelete;

    private Byte isParent;

    private String roleString;

    private static final long serialVersionUID = 1L;

    public MenuAuth(Integer authId, Integer roleId, Integer menuId, Byte roleCreate, Byte roleQuery, Byte roleUpdate, Byte roleDelete, Byte isParent, String roleString) {
        this.authId = authId;
        this.roleId = roleId;
        this.menuId = menuId;
        this.roleCreate = roleCreate;
        this.roleQuery = roleQuery;
        this.roleUpdate = roleUpdate;
        this.roleDelete = roleDelete;
        this.isParent = isParent;
        this.roleString = roleString;
    }

    public MenuAuth() {
        super();
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Byte getRoleCreate() {
        return roleCreate;
    }

    public void setRoleCreate(Byte roleCreate) {
        this.roleCreate = roleCreate;
    }

    public Byte getRoleQuery() {
        return roleQuery;
    }

    public void setRoleQuery(Byte roleQuery) {
        this.roleQuery = roleQuery;
    }

    public Byte getRoleUpdate() {
        return roleUpdate;
    }

    public void setRoleUpdate(Byte roleUpdate) {
        this.roleUpdate = roleUpdate;
    }

    public Byte getRoleDelete() {
        return roleDelete;
    }

    public void setRoleDelete(Byte roleDelete) {
        this.roleDelete = roleDelete;
    }

    public Byte getIsParent() {
        return isParent;
    }

    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
    }

    public String getRoleString() {
        return roleString;
    }

    public void setRoleString(String roleString) {
        this.roleString = roleString == null ? null : roleString.trim();
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
        MenuAuth other = (MenuAuth) that;
        return (this.getAuthId() == null ? other.getAuthId() == null : this.getAuthId().equals(other.getAuthId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getRoleCreate() == null ? other.getRoleCreate() == null : this.getRoleCreate().equals(other.getRoleCreate()))
            && (this.getRoleQuery() == null ? other.getRoleQuery() == null : this.getRoleQuery().equals(other.getRoleQuery()))
            && (this.getRoleUpdate() == null ? other.getRoleUpdate() == null : this.getRoleUpdate().equals(other.getRoleUpdate()))
            && (this.getRoleDelete() == null ? other.getRoleDelete() == null : this.getRoleDelete().equals(other.getRoleDelete()))
            && (this.getIsParent() == null ? other.getIsParent() == null : this.getIsParent().equals(other.getIsParent()))
            && (this.getRoleString() == null ? other.getRoleString() == null : this.getRoleString().equals(other.getRoleString()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthId() == null) ? 0 : getAuthId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getRoleCreate() == null) ? 0 : getRoleCreate().hashCode());
        result = prime * result + ((getRoleQuery() == null) ? 0 : getRoleQuery().hashCode());
        result = prime * result + ((getRoleUpdate() == null) ? 0 : getRoleUpdate().hashCode());
        result = prime * result + ((getRoleDelete() == null) ? 0 : getRoleDelete().hashCode());
        result = prime * result + ((getIsParent() == null) ? 0 : getIsParent().hashCode());
        result = prime * result + ((getRoleString() == null) ? 0 : getRoleString().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authId=").append(authId);
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", roleCreate=").append(roleCreate);
        sb.append(", roleQuery=").append(roleQuery);
        sb.append(", roleUpdate=").append(roleUpdate);
        sb.append(", roleDelete=").append(roleDelete);
        sb.append(", isParent=").append(isParent);
        sb.append(", roleString=").append(roleString);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}