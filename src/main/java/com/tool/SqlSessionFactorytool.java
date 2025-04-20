package com.tool;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactorytool {
    private static SqlSessionFactory sqlSessionFactorytool;
    static{
        try {
            String resource = "Mybatis_config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactorytool = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static SqlSessionFactory getSqlSessionfactory(){
        return sqlSessionFactorytool;
    }
}
