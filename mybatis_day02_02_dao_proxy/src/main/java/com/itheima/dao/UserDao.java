package com.itheima.dao;

import com.itheima.pojo.User;

import java.io.IOException;
import java.util.List;

//用户持久层接口
public interface UserDao  {
    //增
    void save(User user);
    //删
    void deleteById(Integer id);
    //改
    void update(User user);
    //查（查询所有用户）
    List<User> findAll();
    //查（基于ID查询用户）
    User findById(Integer id);
    //查（基于name 模糊查询用户）
    List<User> findByName(String name);
}
