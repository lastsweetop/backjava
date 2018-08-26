package com.sweetop.studymybatis.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/23
 * Time: 下午7:53
 * To change this template use File | Settings | File Templates.
 */
public class MyBatisUtil {
    private SqlSessionFactory sqlSessionFactory;

    public MyBatisUtil() {
        //mybatis的配置文件
        String resource = "config.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream inputStream = MyBatisUtil.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public SqlSession getSqlSession(boolean autoCommint) {
        return sqlSessionFactory.openSession(autoCommint);
    }
}
