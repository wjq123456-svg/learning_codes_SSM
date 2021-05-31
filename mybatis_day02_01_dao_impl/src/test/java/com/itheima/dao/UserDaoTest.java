package com.itheima.dao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

//测试类

public class UserDaoTest {

    private UserDao userDao = new UserDaoImpl();

    @Test
    public void save() {
        User user  = new User();
        user.setUsername("小明");
        user.setSex("男");
        user.setAddress("北京");
        try {
            userDao.save(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void deleteById() {
        try {
            userDao.deleteById(11);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void update() {
        User user  = new User();
        user.setId(14);
        user.setUsername("小明");
        user.setSex("男");
        user.setAddress("北京");
        try {
            userDao.update(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAll() {
        try {
            List<User> userList = userDao.findAll();
            for (User user : userList) {
                System.out.println("user = " + user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void findById() {
        try {
            User user = userDao.findById(15);
            System.out.println("user = " + user);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void findByName() {
        try {
            List<User> userList = userDao.findByName("o");
            for (User user : userList) {
                System.out.println("user = " + user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
