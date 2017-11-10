package com.rayenyang.mybatis.role;

import com.rayenyang.mybatis.BaseTest;
import com.rayenyang.mybatis.mapper.SysRoleMapper;
import com.rayenyang.mybatis.pojo.SysRole;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * description:
 * Created by rayenyang on 2017/11/8.
 */
public class SelectRoleTest extends BaseTest {
    
    @Test
    public void testSelectAll(){
        getSqlSession(sqlSession -> {
            final SysRoleMapper mapper = sqlSession.getMapper(SysRoleMapper.class);
            final List<SysRole> sysRoles = mapper.selectAll();
            System.out.println(sysRoles);
            Assert.assertTrue(sysRoles.size() > 0);
        });
    }
    
    
    @Test
    public void testSelectById(){
        getSqlSession(sqlSession -> {
            final SysRoleMapper mapper = sqlSession.getMapper(SysRoleMapper.class);
            final SysRole sysRole = mapper.selectById(1);
            logger.debug(sysRole);
            Assert.assertNotNull(sysRole);
        });
    }
}
