package com.rayenyang.mybatis.pojo;

/**
 * description:
 * Created by rayenyang on 2017/10/25.
 */
public class SysPrivilege {
    
    private Long id;
    private String privilegeName;
    private String privilegeUrl;
    
    @Override
    public String toString() {
        return "SysPrivilege{" +
                "id=" + id +
                ", privilegeName='" + privilegeName + '\'' +
                ", privilegeUrl='" + privilegeUrl + '\'' +
                '}';
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getPrivilegeName() {
        return privilegeName;
    }
    
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }
    
    public String getPrivilegeUrl() {
        return privilegeUrl;
    }
    
    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}
