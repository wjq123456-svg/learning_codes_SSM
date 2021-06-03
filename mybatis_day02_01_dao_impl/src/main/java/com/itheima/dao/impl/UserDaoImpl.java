package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
//用户持久层实现类
public class UserDaoImpl implements UserDao {
    //保存
    @Override
    public void save(User user) throws IOException {
        //构造SqlSession
        SqlSession ss = SqlSessionUtils.openSession();
        //执行sqlyuju
        ss.insert("userMapper.save",user);
        //释放资源
        ss.commit();
        ss.close();
    }

    //删除
    @Override
    public void deleteById(Integer id) throws IOException {
        //加载Mybatis的核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        //构造SqlSessionFactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //构造SqlSession
        SqlSession ss = ssf.openSession();
        //执行sql语句
        ss.delete("userMapper.deleteById",id);

        //释放资源
        ss.commit();
        ss.close();
    }
    //更新
    @Override
    public void update(User user) throws IOException {
        //加载Mybatis的核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        //构造SqlSessionFactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //构造SqlSession
        SqlSession ss = ssf.openSession();
        //执行sql语句
        ss.update("userMapper.update",user);
        //释放资源
        ss.commit();
        ss.close();

    }
    //查询所有用户
    @Override
    public List<User> findAll() throws IOException {
        //加载Mybatis的核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        //构造SqlSessionFactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //构造SqlSession
        SqlSession ss = ssf.openSession();
        //执行sql语句
        List<User> user = ss.selectList("userMapper.findAll");
        //释放资源

        ss.close();

        return user;
    }
    //根据ID查询用户
    @Override
    public User findById(Integer id) throws IOException {
        //加载Mybatis的核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        //构造SqlSessionFactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //构造SqlSession
        SqlSession ss = ssf.openSession();
        //执行sql语句
        User user = ss.selectOne("userMapper.findById", id);
        //释放资源

        ss.close();
        return user;
    }
    //根据用户名  模糊查询
    @Override
    public List<User> findByName(String name) throws IOException {
        //加载Mybatis的核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        //构造SqlSessionFactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //构造SqlSession
        SqlSession ss = ssf.openSession();
        //执行sql语句
        List<User> userList = ss.selectList("userMapper.findByName", name);
        //释放资源
        ss.close();
        return userList;
    }
}
