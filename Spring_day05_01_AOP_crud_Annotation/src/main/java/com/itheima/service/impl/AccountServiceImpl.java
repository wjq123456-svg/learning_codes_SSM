package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wjq
 * @data:2021/6/14
 * @description:账户业务接口实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    //依赖注入dao
    @Autowired
    private AccountDao accountDao;



    @Override
    public void transfer(String source, String target, double money) {
        Account sourceAccount = accountDao.findByName(source);
        Account targetAccount = accountDao.findByName(target);
        sourceAccount.setMoney(sourceAccount.getMoney() - money);
        targetAccount.setMoney(targetAccount.getMoney() + money);
        accountDao.update(sourceAccount);
        //int i=1/0;
        accountDao.update(targetAccount);
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public Account findByName(String name) {
        return accountDao.findByName(name);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
