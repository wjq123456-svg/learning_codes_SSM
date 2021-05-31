package com.itheima.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {
    //定义私有静态的成员变量
    private static SqlSessionFactory sqlSessionFactory;

    //通过静态代码块  为静态的成员变量赋值
    static {
        //加载Mybatis的核心配置文件
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
            //构造SqlSessionFactory
            sqlSessionFactory  = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //构造方法私有
    private SqlSessionUtils(){}
    //提供公共方法，返回SqlSession对象
    public  static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }

}
