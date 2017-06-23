package com.liuht.entity;

import java.io.Serializable;
import java.util.Date;

public class AppCode implements Serializable {
    private String codeString;

    private String codeName;

    private String codeValue;

    private String codeValueName;

    private Byte codeType;

    private Integer codeCreateer;

    private Date codeCreateTime;

    private Byte codeStatus;

    private static final long serialVersionUID = 1L;

    public AppCode(String codeString, String codeName, String codeValue, String codeValueName, Byte codeType, Integer codeCreateer, Date codeCreateTime, Byte codeStatus) {
        this.codeString = codeString;
        this.codeName = codeName;
        this.codeValue = codeValue;
        this.codeValueName = codeValueName;
        this.codeType = codeType;
        this.codeCreateer = codeCreateer;
        this.codeCreateTime = codeCreateTime;
        this.codeStatus = codeStatus;
    }

    public AppCode() {
        super();
    }

    public String getCodeString() {
        return codeString;
    }

    public void setCodeString(String codeString) {
        this.codeString = codeString == null ? null : codeString.trim();
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    public String getCodeValueName() {
        return codeValueName;
    }

    public void setCodeValueName(String codeValueName) {
        this.codeValueName = codeValueName == null ? null : codeValueName.trim();
    }

    public Byte getCodeType() {
        return codeType;
    }

    public void setCodeType(Byte codeType) {
        this.codeType = codeType;
    }

    public Integer getCodeCreateer() {
        return codeCreateer;
    }

    public void setCodeCreateer(Integer codeCreateer) {
        this.codeCreateer = codeCreateer;
    }

    public Date getCodeCreateTime() {
        return codeCreateTime;
    }

    public void setCodeCreateTime(Date codeCreateTime) {
        this.codeCreateTime = codeCreateTime;
    }

    public Byte getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(Byte codeStatus) {
        this.codeStatus = codeStatus;
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
        AppCode other = (AppCode) that;
        return (this.getCodeString() == null ? other.getCodeString() == null : this.getCodeString().equals(other.getCodeString()))
            && (this.getCodeName() == null ? other.getCodeName() == null : this.getCodeName().equals(other.getCodeName()))
            && (this.getCodeValue() == null ? other.getCodeValue() == null : this.getCodeValue().equals(other.getCodeValue()))
            && (this.getCodeValueName() == null ? other.getCodeValueName() == null : this.getCodeValueName().equals(other.getCodeValueName()))
            && (this.getCodeType() == null ? other.getCodeType() == null : this.getCodeType().equals(other.getCodeType()))
            && (this.getCodeCreateer() == null ? other.getCodeCreateer() == null : this.getCodeCreateer().equals(other.getCodeCreateer()))
            && (this.getCodeCreateTime() == null ? other.getCodeCreateTime() == null : this.getCodeCreateTime().equals(other.getCodeCreateTime()))
            && (this.getCodeStatus() == null ? other.getCodeStatus() == null : this.getCodeStatus().equals(other.getCodeStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCodeString() == null) ? 0 : getCodeString().hashCode());
        result = prime * result + ((getCodeName() == null) ? 0 : getCodeName().hashCode());
        result = prime * result + ((getCodeValue() == null) ? 0 : getCodeValue().hashCode());
        result = prime * result + ((getCodeValueName() == null) ? 0 : getCodeValueName().hashCode());
        result = prime * result + ((getCodeType() == null) ? 0 : getCodeType().hashCode());
        result = prime * result + ((getCodeCreateer() == null) ? 0 : getCodeCreateer().hashCode());
        result = prime * result + ((getCodeCreateTime() == null) ? 0 : getCodeCreateTime().hashCode());
        result = prime * result + ((getCodeStatus() == null) ? 0 : getCodeStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codeString=").append(codeString);
        sb.append(", codeName=").append(codeName);
        sb.append(", codeValue=").append(codeValue);
        sb.append(", codeValueName=").append(codeValueName);
        sb.append(", codeType=").append(codeType);
        sb.append(", codeCreateer=").append(codeCreateer);
        sb.append(", codeCreateTime=").append(codeCreateTime);
        sb.append(", codeStatus=").append(codeStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}