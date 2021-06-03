package com.itheima.congfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 *@Author wjq
 *@Date 2021/5/16
 *@Version v1.0
 *@Description Spring核心配置文件  注解版本
 */
//表示当前类是Spring的配置文件类
@Configuration
//开启Spring的注解扫描
@ComponentScan({"com.itheima"})
//加载子配置文件
@Import({JDBCConfig.class,MybatisConfig.class})
public class SpringConfig {




}
