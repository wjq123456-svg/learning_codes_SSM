package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author:wjq
 * @data:2021/6/14
 * @description:账户持久层接口
 */

public interface AccountDao {

    //保存
    @Insert("insert into account values(#{id},#{name},#{money})")
    void save(Account account);

    //根据ID删除
    @Delete("delete  from account where id=#{id}")
    void delete(@Param("id") Integer id);

    //更新账户
    @Update("update account set name =#{name},money =#{money} where id=#{id}")
    void update(Account account);

    //根据id查询
    @Select("select * from account where id = #{id}")
    Account findById(@Param("id") Integer id);

    //根据名称查询账户
    @Select("select * from  account where name = #{name}")
    Account findByName(@Param("name") String name);

    //查询所有
    @Select("select * from  account")
    List<Account> findAll();
}
