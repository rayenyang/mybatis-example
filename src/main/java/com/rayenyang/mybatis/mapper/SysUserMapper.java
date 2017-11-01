package com.rayenyang.mybatis.mapper;

import com.rayenyang.mybatis.pojo.SysRole;
import com.rayenyang.mybatis.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description:
 * Created by rayenyang on 2017/10/26.
 */
public interface SysUserMapper {
    SysUser selectById(int id);
    
    List<SysUser> selectAll();
    
    SysRole selectRoleById(int id);
    
    int insertUser(SysUser user);
    
    int insertUser2(SysUser user);
    
    int insertUser3(SysUser user);
    
    int update(SysUser user);
    
    int deleteById(long id);
    
    SysRole testMultiArgs(@Param("id") long id, @Param("enabled") boolean enabled);
    
    SysUser selectWithIf(@Param("username") String username, @Param("password") String password);
    
    SysUser selectWithChoose(SysUser sysUser);
    
    SysUser selectWithWhere(SysUser sysUser);
    
    int updateWithSet(SysUser sysUser);
    
    List<SysUser> selectWithFor(@Param("idList") List<Long> idList);
}
