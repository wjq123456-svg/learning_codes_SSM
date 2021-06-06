package com.itheima.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AccountServiceTest {

    @Test
    public void save() {
        //获取Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取service
        AccountService accountService = context.getBean(AccountService.class);
        //调用保存账户方法
        accountService.save();

    }
}