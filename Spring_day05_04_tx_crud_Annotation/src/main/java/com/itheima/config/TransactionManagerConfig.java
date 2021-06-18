package com.itheima.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 *@Author wjq
 *@Date 2021/6/17
 *@Version v1.0
 *@Description 事务管理的配置文件
 */
@Configuration
@Import(JDBCConfig.class)
public class TransactionManagerConfig {
    //配置事务管理器对象
    @Bean("transactionManager")
    public DataSourceTransactionManager createDataSourceTransactionManager(@Qualifier("druidDataSource") DataSource dataSource){
        //创建对象
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        //相关配置（数据源）
        transactionManager.setDataSource(dataSource);

        return transactionManager;
    }
}
