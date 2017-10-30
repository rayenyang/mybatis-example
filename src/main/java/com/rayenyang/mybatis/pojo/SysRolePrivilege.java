package com.rayenyang.mybatis.pojo;

/**
 * description:
 * Created by rayenyang on 2017/10/25.
 */
public class SysRolePrivilege {
    
    private Long roleId;
    private Long privilegeId;
    
    @Override
    public String toString() {
        return "SysRolePrivilege{" +
                "roleId=" + roleId +
                ", privilegeId=" + privilegeId +
                '}';
    }
    
    public Long getRoleId() {
        return roleId;
    }
    
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    
    public Long getPrivilegeId() {
        return privilegeId;
    }
    
    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
