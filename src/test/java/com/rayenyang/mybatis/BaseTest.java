package com.rayenyang.mybatis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * description:
 * Created by rayenyang on 2017/10/26.
 */
public class BaseTest {
    protected static final Log logger = LogFactory.getLog(SelectTest.class);
    protected static SqlSessionFactory sqlSessionFactory;
    
    @BeforeClass
    public static void init() throws IOException {
        final Reader reader = Resources.getResourceAsReader("mybatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        reader.close();
    }
    
    protected void getSqlSession(SqlSessionCallback sqlSessionCallback){
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            sqlSessionCallback.callback(sqlSession);
        }
    }
    
    public interface SqlSessionCallback {
        void callback(SqlSession sqlSession);
    }
}
