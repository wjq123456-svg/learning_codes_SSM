package com.itheima.utils;
/**
 *@Author wjq
 *@Date 2021/6/6
 *@Version v1.0
 *@Description 日志  切面类
 */
public class LogUtil {
    //对切面类中的增强方法，也成为通知，作用：对原有的方法进行功能增强
    public void printLog(){
        System.out.println("LogUtil开始记录日志");
    }
}
