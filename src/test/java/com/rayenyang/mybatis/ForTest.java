package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import com.rayenyang.mybatis.pojo.SysUser;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * description:
 * Created by rayenyang on 2017/11/1.
 */
public class ForTest extends BaseTest{
    
    @Test
    public void forListTest(){
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            final List<SysUser> sysUsers = mapper.selectWithFor(Collections.emptyList());
            Assert.assertTrue(sysUsers.size() > 0);
            System.out.println(sysUsers);
    
            final List<SysUser> sysUsers1 = mapper.selectWithFor(Arrays.asList(1L, 1001L));
            Assert.assertTrue(sysUsers1.size() == 2);
            System.out.println(sysUsers1);
        });
    }
    
    @Test
    public void testWithForMap(){
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            Map<String, Object> args = new HashMap<>();
            args.put("username", "updateWithSet");
            args.put("user_password", "1234");
            final List<SysUser> sysUsers = mapper.selectWithForMap(args);
            Assert.assertTrue(sysUsers.size() > 0);
        });
    }
}
