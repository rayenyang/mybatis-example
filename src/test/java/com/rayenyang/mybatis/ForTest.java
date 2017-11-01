package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import com.rayenyang.mybatis.pojo.SysUser;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
}
