package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author:wjq
 * @data:2021/6/15
 * @description:事物管理器  切面类
 */
@Component
@Aspect
public class TranscationManager {
    //依赖注入一个连接对象
    @Autowired
    private Connection connection;

    //配置通用的切入点表达式
    @Pointcut("execution(* com.itheima.service..*.*(..))")
    public void pointCut(){

    }

    //环绕通知：作用：围绕这切入点方法进行执行，更加灵活的对切入点进行增强
    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object obj = null;
        try{
            //前置通知
            connection.setAutoCommit(false);
            //业务方法执行(获取参数，执行方法)
            Object[] args = proceedingJoinPoint.getArgs();
            obj = proceedingJoinPoint.proceed(args);
            //后置通知
            connection.commit();
        }catch (Throwable throwable){
            throwable.printStackTrace();
            //异常通知
            connection.rollback();
        }finally {
            //最终通知
            connection.close();
        }
        return obj;
    }

}
