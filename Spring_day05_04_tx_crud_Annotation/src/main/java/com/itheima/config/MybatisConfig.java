package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author:wjq
 * @data:2021/6/15
 * @description:
 */
public class MybatisConfig {
    //配置SqlSessionFactoryBean
    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean(@Qualifier("druidDataSource")DataSource dataSource){
        //创建对象
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //相关信息配置（配置数据源  pojo别名）
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.itheima.pojo");

        return sqlSessionFactoryBean;
    }
    //配置dao代理的Mapper扫描器
    @Bean("scannerConfigurer")
    public MapperScannerConfigurer  createMapperScannerConfigurer(){
        //创建对象
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
        scannerConfigurer.setBasePackage("com.itheima.dao");

        return scannerConfigurer;
    }

}
