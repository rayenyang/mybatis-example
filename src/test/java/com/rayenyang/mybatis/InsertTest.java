package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import com.rayenyang.mybatis.pojo.SysUser;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * description:
 * Created by rayenyang on 2017/10/26.
 */
public class InsertTest extends BaseTest{
    
    @Test
    public void testInsert() {
        getSqlSession(sqlSession -> {
            final SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser user = new SysUser();
            user.setUserName("testInsert");
            user.setPassword("1234");
            user.setCreateTime(new Date());
            user.setHeadImg(new byte[]{1,2});
            user.setUserEmail("insert@mybatis.com");
            user.setUserInfo("test insert");
            final int result = userMapper.insertUser(user);
            sqlSession.commit();
            Assert.assertTrue(result==1);
            logger.debug(user.getId());
        });
    }
    @Test
    public void testInsert2() {
        getSqlSession(sqlSession -> {
            final SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser user = new SysUser();
            user.setUserName("testInsert");
            user.setPassword("1234");
            user.setCreateTime(new Date());
            user.setHeadImg(new byte[]{1,2});
            user.setUserEmail("insert@mybatis.com");
            user.setUserInfo("test insert");
            final int result = userMapper.insertUser2(user);
            sqlSession.commit();
            Assert.assertTrue(result==1);
            logger.debug(user.getId());
        });
    }
    @Test
    public void testInsert3() {
        getSqlSession(sqlSession -> {
            final SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser user = new SysUser();
            user.setUserName("testInsert");
            user.setPassword("1234");
            user.setCreateTime(new Date());
            user.setHeadImg(new byte[]{1,2});
            user.setUserEmail("insert@mybatis.com");
            user.setUserInfo("test insert");
            final int result = userMapper.insertUser3(user);
            sqlSession.commit();
            Assert.assertTrue(result==1);
            logger.debug(user.getId());
        });
    }
}
