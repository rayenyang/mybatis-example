package com.rayenyang.mybatis.pojo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * description:
 * Created by rayenyang on 2017/10/25.
 */
public class SysUser {
    private Long id;
    private String userName;
    private String password;
    private String userEmail;
    private String userInfo;
    private byte[] headImg;
    private Date createTime;
    private SysRole role;
    private List<SysRole> roleList;
    
    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", headImg=" + Arrays.toString(headImg) +
                ", createTime=" + createTime +
                ", role=" + role +
                ", roleList=" + roleList +
                '}';
    }
    
    
    public List<SysRole> getRoleList() {
        return roleList;
    }
    
    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }
    
    public SysRole getRole() {
        return role;
    }
    
    public void setRole(SysRole role) {
        this.role = role;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserEmail() {
        return userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public String getUserInfo() {
        return userInfo;
    }
    
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
    
    public byte[] getHeadImg() {
        return headImg;
    }
    
    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
