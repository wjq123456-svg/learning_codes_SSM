package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:wjq
 * @data:2021/6/14
 * @description:账户持久层接口
 */
public interface AccountDao {

    //保存
    void save(Account account);

    //根据ID删除
    void delete(@Param("id") Integer id);

    //更新账户
    void update(Account account);

    //根据id查询
    Account findById(@Param("id") Integer id);

    //根据名称查询账户
    Account findByName(@Param("name") String name);

    //查询所有
    List<Account> findAll();
}
