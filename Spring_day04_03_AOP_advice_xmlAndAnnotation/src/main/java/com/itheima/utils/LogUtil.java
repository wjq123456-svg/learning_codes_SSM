package com.itheima.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *@Author wjq
 *@Date 2021/6/6
 *@Version v1.0
 *@Description 日志切面类
 */
@Component("logUtil")
//开启切面注解
@Aspect
public class LogUtil {
    //配置通用的切入点表达式
    @Pointcut("execution(* com.itheima.service..*.*(.. ))")
    public void pointCut(){

    }

    //前置通知：可以在切入点方法执行前，获取到切入点的方法参数，实现对参数进行增强
    @Before("pointCut()")
    public void beforePrintLog(JoinPoint joinPoint) throws Throwable {
        //获取切入点的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知beforePrintLog"+ Arrays.toString(args));
    }

    //hou置通知：可以在切入点方法执行后，获取到切入点的方法返回值，进行增强
    @AfterReturning(value = "pointCut()",returning = "returnValue")
    public void afterReturningPrintLog(JoinPoint joinPoint,Object returnValue) throws Throwable {
        //获取切入点方法的返回值
        System.out.println("后置通知returnValue = " + returnValue);

    }
    //异常置通知：可以在切入点方法执行过程中抛出异常时，进行增强
    @AfterThrowing(value = "pointCut()",throwing = "t")
    public void afteThrowingPrintLog(JoinPoint joinPoint,Throwable t) throws Throwable {
        t.printStackTrace();
        System.out.println("异常通知 afteThrowingrPrintLog = " + t.getMessage());
    }
    //最终通知：作用：用于是否资源
    @After(value = "pointCut()")
    public void afterPrintLog(JoinPoint joinPoint) throws Throwable {
        System.out.println("最终通知aftePrintLog执行了！！！！");
    }
    //环绕通知：作用：围绕这切入点方法进行执行，更加灵活的对切入点进行增强
    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object obj = null;
        try{
            //前置通知
            this.beforePrintLog(proceedingJoinPoint);
            //业务方法执行(获取参数，执行方法)
            Object[] args = proceedingJoinPoint.getArgs();
            obj = proceedingJoinPoint.proceed(args);
            //后置通知
            this.afterReturningPrintLog(proceedingJoinPoint,obj);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            //异常通知
            this.afteThrowingPrintLog(proceedingJoinPoint,throwable);
        }finally {
            //最终通知
            this.afterPrintLog(proceedingJoinPoint);
        }
        return obj;
    }
}
