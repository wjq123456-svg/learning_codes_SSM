package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author:wjq
 * @data:2021/6/14
 * @description:Spring框架的核心文件
 */
//表示当前类是一个Spring的配置文件
@Configuration
//开启SpringIOC的注解扫描
@ComponentScan(value = "com.itheima")
//开启SpringAop注解的扫描的支持
@EnableAspectJAutoProxy
public class SpringConfig {

}
