package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//测试类
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountServiceTest {

    //依赖注入
    @Autowired
    private  AccountService accountService;

    @Test
    public void transfer() {
        accountService.transfer("迪丽热巴","王瑾权",1);
    }

    @Test
    public void save() {
        Account account1 = new Account();
        account1.setName("王瑾权");
        account1.setMoney(1001.0);
        accountService.save(account1);
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void findById() {
        Account id = accountService.findById(2);
        System.out.println(id);
    }

    @Test
    public void findByName() {
        Account name = accountService.findByName("王瑾权");
        System.out.println(name);
    }

    @Test
    public void findAll() {
        List<Account> accountServiceAll = accountService.findAll();
        for (Account account : accountServiceAll) {
            System.out.println(account);
        }
    }
}