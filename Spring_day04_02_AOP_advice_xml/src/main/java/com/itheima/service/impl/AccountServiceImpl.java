package com.itheima.service.impl;

import com.itheima.service.AccountService;
/**
 *@Author wjq
 *@Date 2021/6/6
 *@Version v1.0
 *@Description 账户业务接口实现类
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public void save() {
        System.out.println("模拟保存账户。。。。。");
        int i = 1/0;
    }

    @Override
    public void update(int i) {
        System.out.println("更新账户。。。。"+i);
    }

    @Override
    public int delete() {
        System.out.println("删除账户。。。。。");
        return 1000;
    }
}
