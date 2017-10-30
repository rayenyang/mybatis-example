package com.rayenyang.mybatis;

import com.rayenyang.mybatis.mapper.SysUserMapper;
import org.junit.Assert;
import org.junit.Test;

/**
 * description:
 * Created by rayenyang on 2017/10/27.
 */
public class DeleteTest extends BaseTest {
    
    @Test
    public void testDelete() {
        getSqlSession(sqlSession -> {
            final SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
            final int result = mapper.deleteById(1009L);
            Assert.assertTrue(result == 1);
            sqlSession.commit();
        });
    }
}
