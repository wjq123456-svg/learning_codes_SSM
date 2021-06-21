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
//用法2：RequestMapping注解作用在类上，实现对请求路径的分类管理，限定类中方法访问的前缀
@Controller
@RequestMapping("user")
public class UserController {
    //Servlet中的方法
    //用法1：多个URL路径映射到同一个Handler（同一个方法中）
    @RequestMapping(value = {"gotoResultURL1","gotoResultURL2"})
    public ModelAndView gotoResultURL(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+" User======gotoResultURL1");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

    //用法4：Params属性限定请求参数：支持简单的表达式语法，url一样，根据携带参数的不同进入不同的方法处理
    //普通用户
    @RequestMapping(value = {"login"},params = "type=user")
    public ModelAndView loginUser(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+" ======User");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
    //管理用户
    @RequestMapping(value = {"login"},params = "type= admin")
    public ModelAndView loginAdmin(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+" ======Admin");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
    //VIP
    @RequestMapping(value = {"login"},params = "type=vip")
    public ModelAndView loginVIP(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+" ======VIP");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
    //params表示必须出现参数
    @RequestMapping(value = {"gotoResultParamsURL"},params = "id")
    public ModelAndView gotoResultParamsURL(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+" ======VIP");
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

}
