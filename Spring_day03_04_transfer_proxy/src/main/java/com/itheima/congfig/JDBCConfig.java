package com.itheima.congfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@PropertySource("classpath:jdbc.properties")
@Configuration
public class JDBCConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //配置数据源
    @Bean("druidDataSource")
    public DruidDataSource createDruidDataSource(){
        //创建对象
        DruidDataSource druidDataSource = new DruidDataSource();
        //配置相关信息（驱动，url，用户名，密码）
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        //返回对象
        return druidDataSource;
    }
    @Bean("connection")
    public Connection createConnection(@Qualifier("druidDataSource") DataSource dataSource){
        //保证Service层使用的Connection对象与Mybatis执行Sql时使用的Connection是用一个，用到ThreadLocal技术来解决
        //1，事务同步管理器，提供了一个同步方法
        //2，数据源工具类，提供了获取Connection对象的方法，从ThreadLocal中进行获取
        TransactionSynchronizationManager.initSynchronization();
        Connection connection = DataSourceUtils.getConnection(dataSource);

        //返回连接对象
        return connection;
    }
}
