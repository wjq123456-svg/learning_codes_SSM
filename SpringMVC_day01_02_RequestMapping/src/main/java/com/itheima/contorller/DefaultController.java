package com.itheima.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 *@Author wjq
 *@Date 2021/6/18
 *@Version v1.0
 *@Description 业务处理的控制器，包含了多个处理器的方法
 */
//用法2：RequestMapping注解作用在类上，实现对请求路径的分类管理，限定类中方法访问的前缀
@Controller
@RequestMapping("default")
public class DefaultController {
    //Servlet中的方法
    //用法1：多个URL路径映射到同一个Handler（同一个方法中）
    @RequestMapping(value = {"gotoResultURL1","gotoResultURL2"})
    public ModelAndView gotoResultURL(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"Default======gotoResultURL1");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

    //用法3：method属性限定请求方法：请求的handler相同，请求方式不同进入不同方法处理
    @RequestMapping(value = {"gotoResultMethod"},method= RequestMethod.GET)
    public ModelAndView gotoResultMethodGet(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"===Get===gotoResultURL1");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

    @RequestMapping(value = {"gotoResultMethod"},method= RequestMethod.POST)
    public ModelAndView gotoResultMethodPost(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"===Post===gotoResultURL1");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
