package com.liuht.entity;

import java.io.Serializable;
import java.util.Date;

public class UserRoles implements Serializable {
    private Integer roleId;

    private String roleName;

    private String roleString;

    private Byte roleType;

    private Byte roleStatus;

    private Integer roleCreater;

    private Date roleCreateTime;

    private static final long serialVersionUID = 1L;

    public UserRoles(Integer roleId, String roleName, String roleString, Byte roleType, Byte roleStatus, Integer roleCreater, Date roleCreateTime) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleString = roleString;
        this.roleType = roleType;
        this.roleStatus = roleStatus;
        this.roleCreater = roleCreater;
        this.roleCreateTime = roleCreateTime;
    }

    public UserRoles() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleString() {
        return roleString;
    }

    public void setRoleString(String roleString) {
        this.roleString = roleString == null ? null : roleString.trim();
    }

    public Byte getRoleType() {
        return roleType;
    }

    public void setRoleType(Byte roleType) {
        this.roleType = roleType;
    }

    public Byte getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Byte roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Integer getRoleCreater() {
        return roleCreater;
    }

    public void setRoleCreater(Integer roleCreater) {
        this.roleCreater = roleCreater;
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
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
        UserRoles other = (UserRoles) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleString() == null ? other.getRoleString() == null : this.getRoleString().equals(other.getRoleString()))
            && (this.getRoleType() == null ? other.getRoleType() == null : this.getRoleType().equals(other.getRoleType()))
            && (this.getRoleStatus() == null ? other.getRoleStatus() == null : this.getRoleStatus().equals(other.getRoleStatus()))
            && (this.getRoleCreater() == null ? other.getRoleCreater() == null : this.getRoleCreater().equals(other.getRoleCreater()))
            && (this.getRoleCreateTime() == null ? other.getRoleCreateTime() == null : this.getRoleCreateTime().equals(other.getRoleCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleString() == null) ? 0 : getRoleString().hashCode());
        result = prime * result + ((getRoleType() == null) ? 0 : getRoleType().hashCode());
        result = prime * result + ((getRoleStatus() == null) ? 0 : getRoleStatus().hashCode());
        result = prime * result + ((getRoleCreater() == null) ? 0 : getRoleCreater().hashCode());
        result = prime * result + ((getRoleCreateTime() == null) ? 0 : getRoleCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleString=").append(roleString);
        sb.append(", roleType=").append(roleType);
        sb.append(", roleStatus=").append(roleStatus);
        sb.append(", roleCreater=").append(roleCreater);
        sb.append(", roleCreateTime=").append(roleCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}