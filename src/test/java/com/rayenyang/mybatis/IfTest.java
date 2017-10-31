package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import com.rayenyang.mybatis.pojo.SysUser;
import org.junit.Assert;
import org.junit.Test;

/**
 * description:
 * Created by rayenyang on 2017/10/31.
 */
public class IfTest extends BaseTest {
    
    @Test
    public void testSelectWithIf() {
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            final SysUser user1 = mapper.selectWithIf("testUpdate", null);
            final SysUser user2 = mapper.selectWithIf(null, "123456");
            Assert.assertNotNull(user1);
            Assert.assertNotNull(user2);
            System.out.println(user1);
            System.out.println(user2);
        });
    }
    
    @Test
    public void testSelectWithChoose() {
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser user1 = new SysUser();
            user1.setId(1001L);
            final SysUser result1 = mapper.selectWithChoose(user1);
            SysUser user2 = new SysUser();
            user2.setUserName("testUpdate");
            final SysUser result2 = mapper.selectWithChoose(user2);
    
            final SysUser result3 = mapper.selectWithChoose(new SysUser());
            
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
        });
    }
}
