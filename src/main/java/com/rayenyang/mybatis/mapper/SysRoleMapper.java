package com.rayenyang.mybatis.mapper;

import com.rayenyang.mybatis.pojo.SysRole;

import java.util.List;

/**
 * description:
 * Created by rayenyang on 2017/11/8.
 */
public interface SysRoleMapper {
    
    List<SysRole> selectAll();
    
    SysRole selectById(int id);
}
