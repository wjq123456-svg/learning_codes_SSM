package com.itheima.service;


import com.itheima.congfig.SpringConfig;
import com.itheima.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
/**
 *@Author wjq
 *@Date 2021/5/16
 *@Version v1.0
 *@Description //测试类
 */


@RunWith(SpringJUnit4ClassRunner.class)
//xml形式的配置文件
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

//注解形式的配置文件（java的字节码文件）
@ContextConfiguration(classes = {SpringConfig.class})

public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    //转账方法
    @Test
    public void transfer(){
        accountService.transfer("迪丽热巴","古力娜扎",100);

    }

    @Test
    public void save() {

        Account account = new Account();
        account.setName("隔壁老李");
        account.setMoney(1000.24);
        accountService.save(account);
    }

    @Test
    public void delete() {

        accountService.delete(8);
    }

    @Test
    public void update() {

        Account account = new Account();
        account.setId(3);
        account.setName("隔壁老王");
        account.setMoney(113.4);

        accountService.update(account);
    }

    @Test
    public void findById() {
    }

    @Test
    public void findByName() {
    }

    @Test
    public void findAll() {
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println("account = " + account);
        }
    }
}
