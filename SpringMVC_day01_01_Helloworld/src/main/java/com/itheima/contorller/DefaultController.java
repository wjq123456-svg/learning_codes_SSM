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
    @RequestMapping("gotoResult")
    public ModelAndView gotoResult(ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date());
        //指定页面
        modelAndView.setViewName("src/main/webapp/WEB-INF/jsp/result.jsp");
        return modelAndView;
    }
}
