package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import com.rayenyang.mybatis.pojo.SysUser;
import org.junit.Assert;
import org.junit.Test;

/**
 * description:
 * Created by rayenyang on 2017/10/31.
 */
public class WhereTest extends BaseTest {
    
    @Test
    public void testSelectWithWhere() {
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser user = new SysUser();
            user.setUserName("admin");
            final SysUser result = mapper.selectWithWhere(user);
            Assert.assertNotNull(result);
            user.setPassword("aaaa");
            final SysUser result2 = mapper.selectWithWhere(user);
            Assert.assertNull(result2);
        });
    }
}
