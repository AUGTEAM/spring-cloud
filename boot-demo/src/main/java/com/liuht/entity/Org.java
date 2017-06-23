package com.liuht.entity;

import java.io.Serializable;
import java.util.Date;

public class Org implements Serializable {
    private Integer orgId;

    private Integer parentOrgId;

    private String orgName;

    private String costomno;

    private Byte orgType;

    private String orgIdPath;

    private String orgNamePath;

    private Integer orgLevel;

    private Integer sort;

    private Integer userCreater;

    private Date userCreateTime;

    private Byte orgStatus;

    private Byte isLeaf;

    private static final long serialVersionUID = 1L;

    public Org(Integer orgId, Integer parentOrgId, String orgName, String costomno, Byte orgType, String orgIdPath, String orgNamePath, Integer orgLevel, Integer sort, Integer userCreater, Date userCreateTime, Byte orgStatus, Byte isLeaf) {
        this.orgId = orgId;
        this.parentOrgId = parentOrgId;
        this.orgName = orgName;
        this.costomno = costomno;
        this.orgType = orgType;
        this.orgIdPath = orgIdPath;
        this.orgNamePath = orgNamePath;
        this.orgLevel = orgLevel;
        this.sort = sort;
        this.userCreater = userCreater;
        this.userCreateTime = userCreateTime;
        this.orgStatus = orgStatus;
        this.isLeaf = isLeaf;
    }

    public Org() {
        super();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(Integer parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getCostomno() {
        return costomno;
    }

    public void setCostomno(String costomno) {
        this.costomno = costomno == null ? null : costomno.trim();
    }

    public Byte getOrgType() {
        return orgType;
    }

    public void setOrgType(Byte orgType) {
        this.orgType = orgType;
    }

    public String getOrgIdPath() {
        return orgIdPath;
    }

    public void setOrgIdPath(String orgIdPath) {
        this.orgIdPath = orgIdPath == null ? null : orgIdPath.trim();
    }

    public String getOrgNamePath() {
        return orgNamePath;
    }

    public void setOrgNamePath(String orgNamePath) {
        this.orgNamePath = orgNamePath == null ? null : orgNamePath.trim();
    }

    public Integer getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getUserCreater() {
        return userCreater;
    }

    public void setUserCreater(Integer userCreater) {
        this.userCreater = userCreater;
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public Byte getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Byte orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Byte getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Byte isLeaf) {
        this.isLeaf = isLeaf;
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
        Org other = (Org) that;
        return (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getParentOrgId() == null ? other.getParentOrgId() == null : this.getParentOrgId().equals(other.getParentOrgId()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getCostomno() == null ? other.getCostomno() == null : this.getCostomno().equals(other.getCostomno()))
            && (this.getOrgType() == null ? other.getOrgType() == null : this.getOrgType().equals(other.getOrgType()))
            && (this.getOrgIdPath() == null ? other.getOrgIdPath() == null : this.getOrgIdPath().equals(other.getOrgIdPath()))
            && (this.getOrgNamePath() == null ? other.getOrgNamePath() == null : this.getOrgNamePath().equals(other.getOrgNamePath()))
            && (this.getOrgLevel() == null ? other.getOrgLevel() == null : this.getOrgLevel().equals(other.getOrgLevel()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getUserCreater() == null ? other.getUserCreater() == null : this.getUserCreater().equals(other.getUserCreater()))
            && (this.getUserCreateTime() == null ? other.getUserCreateTime() == null : this.getUserCreateTime().equals(other.getUserCreateTime()))
            && (this.getOrgStatus() == null ? other.getOrgStatus() == null : this.getOrgStatus().equals(other.getOrgStatus()))
            && (this.getIsLeaf() == null ? other.getIsLeaf() == null : this.getIsLeaf().equals(other.getIsLeaf()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getParentOrgId() == null) ? 0 : getParentOrgId().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getCostomno() == null) ? 0 : getCostomno().hashCode());
        result = prime * result + ((getOrgType() == null) ? 0 : getOrgType().hashCode());
        result = prime * result + ((getOrgIdPath() == null) ? 0 : getOrgIdPath().hashCode());
        result = prime * result + ((getOrgNamePath() == null) ? 0 : getOrgNamePath().hashCode());
        result = prime * result + ((getOrgLevel() == null) ? 0 : getOrgLevel().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getUserCreater() == null) ? 0 : getUserCreater().hashCode());
        result = prime * result + ((getUserCreateTime() == null) ? 0 : getUserCreateTime().hashCode());
        result = prime * result + ((getOrgStatus() == null) ? 0 : getOrgStatus().hashCode());
        result = prime * result + ((getIsLeaf() == null) ? 0 : getIsLeaf().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgId=").append(orgId);
        sb.append(", parentOrgId=").append(parentOrgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", costomno=").append(costomno);
        sb.append(", orgType=").append(orgType);
        sb.append(", orgIdPath=").append(orgIdPath);
        sb.append(", orgNamePath=").append(orgNamePath);
        sb.append(", orgLevel=").append(orgLevel);
        sb.append(", sort=").append(sort);
        sb.append(", userCreater=").append(userCreater);
        sb.append(", userCreateTime=").append(userCreateTime);
        sb.append(", orgStatus=").append(orgStatus);
        sb.append(", isLeaf=").append(isLeaf);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}