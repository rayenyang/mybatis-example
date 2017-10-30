package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import com.rayenyang.mybatis.pojo.SysUser;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * description:
 * Created by rayenyang on 2017/10/27.
 */
public class UpdateTest extends BaseTest {
    
    @Test
    public void testUpdate() {
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser user = new SysUser();
            user.setId(1001L);
            user.setUserName("testUpdate");
            user.setPassword("1234");
            user.setCreateTime(new Date());
            final int update = mapper.update(user);
            Assert.assertTrue(update == 1);
            sqlSession.commit();
        });
    }
}
