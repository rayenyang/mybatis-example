package com.rayenyang.mybatis.pojo;

/**
 * description:
 * Created by rayenyang on 2017/10/25.
 */
public class SysUserRole {
    private Long userId;
    private Long roleId;
    
    @Override
    public String toString() {
        return "SysUserRole{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public Long getRoleId() {
        return roleId;
    }
    
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
