package com.itheima.utils;

import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author:wjq
 * @data:2021/6/15
 * @description:事物管理器  切面类
 */
public class TranscationManager {
    //依赖注入一个连接对象
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //保证Service层使用的Connection与Mybatis执行sql语句时 用的Connection是 同一个对象
    public void init(){
        TransactionSynchronizationManager.initSynchronization();
    }

    //开启事务（前置通知）
    public void begin(){
        try {
            DataSourceUtils.getConnection(dataSource).setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //提交事务（后置通知）
    public void commit(){
        try {
            DataSourceUtils.getConnection(dataSource).commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //回滚事务（异常通知）
    public void rollback(){
        try {
            DataSourceUtils.getConnection(dataSource).rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //释放资源（最终通知）
    public void close(){
        try {
            DataSourceUtils.getConnection(dataSource).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
