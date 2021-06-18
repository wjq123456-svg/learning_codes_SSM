package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *@Author wjq
 *@Date 2021/6/17
 *@Version v1.0
 *@Description JDBCTemplate的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class JDBCTemplateTest {
    //依赖注入
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //增加
    @Test
    public void  saveTest(){
        Account account = new Account();
        account.setName("小丽");
        account.setMoney(666d);
        String sql = "insert into account values(?,?,?)";

        //执行sql
        Object[] params = {account.getId(),account.getName(),account.getMoney()};
        jdbcTemplate.update(sql,params);
    }
    @Test
    public void  findAllTest(){

        String sql = "select id,name names,money from account";
        List<Account> accountList = jdbcTemplate.query(sql, new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet resultSet, int i) throws SQLException {
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setName(resultSet.getString("names"));
                account.setMoney(resultSet.getDouble("money"));

                return account;
            }
        });

        //执行sql
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
