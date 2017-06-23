package com.liuht.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private String userName;

    private Byte userSex;

    private String userLogin;

    private String userPwd;

    private Byte userPwdWrongTimes;

    private Date userPwdUpdateTime;

    private Byte userLock;

    private Byte userStatus;

    private String userPhone;

    private String userEmail;

    private String userHeaderPic;

    private Integer userCreater;

    private Date userCreateTime;

    private Integer orgId;

    private String orgName;

    private static final long serialVersionUID = 1L;

    public User(Integer userId, String userName, Byte userSex, String userLogin, String userPwd, Byte userPwdWrongTimes, Date userPwdUpdateTime, Byte userLock, Byte userStatus, String userPhone, String userEmail, String userHeaderPic, Integer userCreater, Date userCreateTime, Integer orgId, String orgName) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userLogin = userLogin;
        this.userPwd = userPwd;
        this.userPwdWrongTimes = userPwdWrongTimes;
        this.userPwdUpdateTime = userPwdUpdateTime;
        this.userLock = userLock;
        this.userStatus = userStatus;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userHeaderPic = userHeaderPic;
        this.userCreater = userCreater;
        this.userCreateTime = userCreateTime;
        this.orgId = orgId;
        this.orgName = orgName;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getUserSex() {
        return userSex;
    }

    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin == null ? null : userLogin.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Byte getUserPwdWrongTimes() {
        return userPwdWrongTimes;
    }

    public void setUserPwdWrongTimes(Byte userPwdWrongTimes) {
        this.userPwdWrongTimes = userPwdWrongTimes;
    }

    public Date getUserPwdUpdateTime() {
        return userPwdUpdateTime;
    }

    public void setUserPwdUpdateTime(Date userPwdUpdateTime) {
        this.userPwdUpdateTime = userPwdUpdateTime;
    }

    public Byte getUserLock() {
        return userLock;
    }

    public void setUserLock(Byte userLock) {
        this.userLock = userLock;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserHeaderPic() {
        return userHeaderPic;
    }

    public void setUserHeaderPic(String userHeaderPic) {
        this.userHeaderPic = userHeaderPic == null ? null : userHeaderPic.trim();
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

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserLogin() == null ? other.getUserLogin() == null : this.getUserLogin().equals(other.getUserLogin()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getUserPwdWrongTimes() == null ? other.getUserPwdWrongTimes() == null : this.getUserPwdWrongTimes().equals(other.getUserPwdWrongTimes()))
            && (this.getUserPwdUpdateTime() == null ? other.getUserPwdUpdateTime() == null : this.getUserPwdUpdateTime().equals(other.getUserPwdUpdateTime()))
            && (this.getUserLock() == null ? other.getUserLock() == null : this.getUserLock().equals(other.getUserLock()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserHeaderPic() == null ? other.getUserHeaderPic() == null : this.getUserHeaderPic().equals(other.getUserHeaderPic()))
            && (this.getUserCreater() == null ? other.getUserCreater() == null : this.getUserCreater().equals(other.getUserCreater()))
            && (this.getUserCreateTime() == null ? other.getUserCreateTime() == null : this.getUserCreateTime().equals(other.getUserCreateTime()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserLogin() == null) ? 0 : getUserLogin().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getUserPwdWrongTimes() == null) ? 0 : getUserPwdWrongTimes().hashCode());
        result = prime * result + ((getUserPwdUpdateTime() == null) ? 0 : getUserPwdUpdateTime().hashCode());
        result = prime * result + ((getUserLock() == null) ? 0 : getUserLock().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserHeaderPic() == null) ? 0 : getUserHeaderPic().hashCode());
        result = prime * result + ((getUserCreater() == null) ? 0 : getUserCreater().hashCode());
        result = prime * result + ((getUserCreateTime() == null) ? 0 : getUserCreateTime().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userLogin=").append(userLogin);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userPwdWrongTimes=").append(userPwdWrongTimes);
        sb.append(", userPwdUpdateTime=").append(userPwdUpdateTime);
        sb.append(", userLock=").append(userLock);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userHeaderPic=").append(userHeaderPic);
        sb.append(", userCreater=").append(userCreater);
        sb.append(", userCreateTime=").append(userCreateTime);
        sb.append(", orgId=").append(orgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}