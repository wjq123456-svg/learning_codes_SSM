package com.itheima.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 *@Author wjq
 *@Date 2021/6/18
 *@Version v1.0
 *@Description 业务处理的控制器，包含了多个处理器的方法
 */
@Controller
public class DefaultController {
    //Servlet中的方法
    //用法1：多个URL路径映射到同一个Handler（同一个方法中）
    @RequestMapping(value = {"gotoResultURL1","gotoResultURL2"})
    public ModelAndView gotoResultURL(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"======gotoResultURL1");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
