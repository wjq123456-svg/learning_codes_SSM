package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @author:wjq
 * @data:2021/6/15
 * @description:Spring 核心配置文件（注解版本）
 */
@Configuration
//开启Spring注解扫描
@ComponentScan("com.itheima")
//开启SpringAOP注解扫描的支持
@EnableAspectJAutoProxy
//导入相关的子配置文件
@Import({JDBCConfig.class,MybatisConfig.class})
public class SpringConfig {
}
