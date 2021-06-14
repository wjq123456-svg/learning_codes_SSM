package com.itheima.service;


import com.itheima.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *@Author wjq
 *@Date 2021/6/6
 *@Version v1.0
 *@Description 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件 注解的形式（加载的是java的字节码文件）
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountServiceTest {
    //依赖注入
    @Autowired
    private AccountService accountService;

    @Test
    public void save() {
        accountService.save();
    }

    @Test
    public void update() {
        accountService.update(123);
    }

    @Test
    public void delete() {
        int result = accountService.delete();
        System.out.println("在测试类中的result = " + result);
    }
}