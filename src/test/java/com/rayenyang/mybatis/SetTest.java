package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import com.rayenyang.mybatis.pojo.SysUser;
import org.junit.Assert;
import org.junit.Test;

/**
 * description:
 * Created by rayenyang on 2017/11/1.
 */
public class SetTest extends BaseTest {
    
    @Test
    public void testSet(){
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser user = new SysUser();
            user.setId(1001L);
            user.setUserName("updateWithSet");
            user.setUserInfo("test set");
            
            final int result = mapper.updateWithSet(user);
    
            Assert.assertTrue(result > 0);
            sqlSession.commit();
        });
    }
}
