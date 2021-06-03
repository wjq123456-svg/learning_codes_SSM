package com.itheima.congfig;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class MybatisConfig {
    //配置SqlSessionFactoryBean
    //参数DataSource druidDataSource 从SpringIOC容器中获取数据源的对象
    //参数中@Qualifier("druidDataSource")通过id的方式 进行依赖注入

    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean(@Qualifier("druidDataSource") DataSource dataSource){
        //创建对象
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        //配置相关信息（数据源，pojo别名映射）
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setTypeAliasesPackage("com.itheima.pojo");
        //返回对象
        return  sqlSessionFactory;
    }

    //配置Mapper扫描，生成dao接口代理对象，添加代理对象到Spring的IOC容器中
    @Bean("scannerConfigurer")
    public MapperScannerConfigurer createmapperScannerConfigurer(){
        //创建对象
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
        //配置相关信息（扫描dao包）
        scannerConfigurer.setBasePackage("com.itheima.dao");
        //返回对象
        return scannerConfigurer;
    }
}
