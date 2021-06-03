package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import com.itheima.utils.TranscationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    //依赖注入dao
    @Autowired
    private AccountDao accountDao;
    /*@Autowired
    private Connection connection;*/
    /*@Autowired
    private TranscationManager transcationManager;*/

    //转账方法
    @Override
    public void transfer(String source, String target, double money) {
        Account sourceAccount = accountDao.findByName(source);
        Account targetAccount = accountDao.findByName(target);
        sourceAccount.setMoney(sourceAccount.getMoney() - money);
        targetAccount.setMoney(targetAccount.getMoney() + money);
        accountDao.update(sourceAccount);
        //模拟异常
        //int i = 1/0;
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
