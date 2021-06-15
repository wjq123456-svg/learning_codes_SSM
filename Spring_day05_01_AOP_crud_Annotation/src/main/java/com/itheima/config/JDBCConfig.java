package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.utils.TranscationManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author:wjq
 * @data:2021/6/15
 * @description:
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JDBCConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    //配置数据 源
    @Bean("druidDataSource")
    public DruidDataSource createDrudiDataSource(){
        //创建对象
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);

        return druidDataSource;

    }
    //配置Connection对象
    @Bean("connection")
    public Connection createconnection(@Qualifier("druidDataSource")DataSource dataSource){
        TransactionSynchronizationManager.initSynchronization();
        Connection connection = DataSourceUtils.getConnection(dataSource);

        return connection;
    }
}
