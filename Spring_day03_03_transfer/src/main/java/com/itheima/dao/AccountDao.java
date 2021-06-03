package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

//账户持久层接口
public interface AccountDao {

    @Insert("insert into account values (#{id},#{name},#{money})")
    //保存
    void save(Account account);

    @Delete("delete from account where id = #{id}")
    //根据id删除
    void delete(@Param("id") Integer id);

    //更新账户
    @Update("update account set name=#{name},money=#{money} where id =#{id}")
    void update(Account account);

    @Select("select * from  account where id=#{id}")
    //根据id查询
    Account findById(@Param("id") Integer id);

    @Select("select * from  account where name=#{name}")
    //根据名称查询账户
    Account findByName(@Param("name") String name);

    @Select("select * from account")
    //查询所有
    List<Account> findAll();
}
