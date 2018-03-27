package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import com.rayenyang.mybatis.pojo.SysRole;
import com.rayenyang.mybatis.pojo.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * description:
 * Created by rayenyang on 2017/10/23.
 */
public class SelectTest extends BaseTest {
    
    @Test
    public void cacheTest() throws Throwable{
        final SqlSession sqlSession = sqlSessionFactory.openSession();
        final SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        final SysUser sysUser = userMapper.selectById(1);
        System.out.println(sysUser);
        sysUser.setUserName("ryen");
        final SysUser sysUser1 = userMapper.selectById(1);
        System.out.println(sysUser1);
        sqlSession.close();
        System.out.println("================================");
        final SqlSession sqlSession1 = sqlSessionFactory.openSession();
        final SysUserMapper userMapper1 = sqlSession1.getMapper(SysUserMapper.class);
        final SysUser sysUser3 = userMapper1.selectById(1);
        System.out.println(sysUser3);
        sysUser3.setUserName("ooooooooooooooo");
        sqlSession1.close();
        final SqlSession sqlSession2 = sqlSessionFactory.openSession();
        final SysUserMapper userMapper2 = sqlSession2.getMapper(SysUserMapper.class);
    
        final SysUser sysUser4 = userMapper2.selectById(1);
        System.out.println(sysUser4);
        sqlSession.close();
    }
    
    @Test
    public void testSelectById() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
//            final User user = sqlSession.selectOne("com.rayenyang.mybatis.mapper.UserMapper.selectById", 7);
            final SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            final SysUser user = userMapper.selectById(1);
            Assert.assertNotNull(user);
            logger.debug(user);
        }
    }
    
    @Test
    public void testSelectAll() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            final SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            final List<SysUser> userList = userMapper.selectAll();
            Assert.assertNotNull(userList);
            logger.debug(userList);
        }
    }
    
    @Test
    public void testSelectRole() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            final SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            final SysRole sysRole = userMapper.selectRoleById(1001);
            Assert.assertNotNull(sysRole);
            logger.debug(sysRole);
        }
    }
    
    @Test
    public void testMultiArgs() {
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            final SysRole sysRole = mapper.testMultiArgs(1101, true);
            Assert.assertNotNull(sysRole);
            logger.debug(sysRole);
        });
    }
    
    @Test
    public void testSelectAllAndRole(){
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            final List<SysUser> sysUsers = mapper.selectAllAndRole();
            System.out.println(sysUsers);
            Assert.assertTrue(sysUsers.size() > 0);
            Assert.assertTrue(sysUsers.get(0).getRole() != null);
        });
    }
    @Test
    public void testSelectAllAndRole2(){
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            final List<SysUser> sysUsers = mapper.selectAllAndRole2();
//            System.out.println(sysUsers);
            Assert.assertTrue(sysUsers.size() > 0);
            System.out.println("--------------------------------------");
            for (SysUser sysUser : sysUsers) {
                System.out.println(sysUser.getRole());
            }
        });
    }
    @Test
    public void testSelectAllAndRole3(){
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            final List<SysUser> sysUsers = mapper.selectAllAndRole3();
//            System.out.println(sysUsers);
            Assert.assertTrue(sysUsers.size() > 0);
            System.out.println("--------------------------------------");
            for (SysUser sysUser : sysUsers) {
                System.out.println(sysUser.getRoleList());
            }
        });
    }
    @Test
    public void testSelectAllAndRole4(){
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            final List<SysUser> sysUsers = mapper.selectAllAndRole4();
//            System.out.println(sysUsers);
            Assert.assertTrue(sysUsers.size() > 0);
            System.out.println("--------------------------------------");
            for (SysUser sysUser : sysUsers) {
                System.out.println(sysUser.getRoleList());
            }
        });
    }
    
    
}
