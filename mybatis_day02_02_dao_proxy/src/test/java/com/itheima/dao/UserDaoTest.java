package com.itheima.dao;


import com.itheima.Utils.SqlSessionUtils;
import com.itheima.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.*;


public class UserDaoTest {
    @Test
    public void save() {
        //通过工具类，获取SQLSession对象
        SqlSession ss = SqlSessionUtils.openSession();
        //通过SQLSession获取指定dao接口的代理对象
        UserDao userDao = ss.getMapper(UserDao.class);
        //通过dao接口的代理对象，调用执行dao层的方法
        User user = new User();
        user.setUsername("花花");
        user.setSex("女");
        user.setAddress("上海");
        userDao.save(user);
        //释放资源
        ss.commit();
        ss.close();
    }

    @Test
    public void deleteById() {
        //通过工具类，获取SQLSession对象
        SqlSession ss = SqlSessionUtils.openSession();
        //通过SQLSession获取指定dao接口的代理对象
        UserDao userDao = ss.getMapper(UserDao.class);
        userDao.deleteById(12);
        ss.commit();
        ss.close();

    }

    @Test
    public void update() {
        //通过工具类，获取SQLSession对象
        SqlSession ss = SqlSessionUtils.openSession();
        //通过SQLSession获取指定dao接口的代理对象
        UserDao userDao = ss.getMapper(UserDao.class);
        User user = new User();
        user.setId(7);
        user.setUsername("花花");
        user.setSex("女");
        user.setAddress("上海");
        userDao.update(user);

        ss.commit();
        ss.close();
    }

    @Test
    public void findAll() {
        SqlSession ss = SqlSessionUtils.openSession();
        //通过SQLSession获取指定dao接口的代理对象
        UserDao userDao = ss.getMapper(UserDao.class);
        List<User> userlist = userDao.findAll();
        for (User user : userlist) {
            System.out.println("User"+user);
        }
        ss.close();

    }

    @Test
    public void findById() {
        SqlSession ss = SqlSessionUtils.openSession();
        //通过SQLSession获取指定dao接口的代理对象
        UserDao userDao = ss.getMapper(UserDao.class);
        User user1 = userDao.findById(3);
        System.out.println("User"+user1);
        ss.close();
    }

    @Test
    public void findByName() {
        SqlSession ss = SqlSessionUtils.openSession();
        //通过SQLSession获取指定dao接口的代理对象
        UserDao userDao = ss.getMapper(UserDao.class);
        List<User> userlist = userDao.findByName("o");
        for (User user : userlist) {
            System.out.println("User"+user);
        }
        ss.close();
    }
}
