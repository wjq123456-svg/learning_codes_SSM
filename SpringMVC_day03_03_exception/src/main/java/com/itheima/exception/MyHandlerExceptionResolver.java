package com.itheima.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest Request, HttpServletResponse Response, Object o, Exception e) {
        //给开发者看的异常信息
        e.printStackTrace();

        //给浏览器用户看的信息
        ModelAndView modelAndView = new ModelAndView();
        //设置给用户看的错误提示信息
        modelAndView.addObject("message","亲，服务器服务中，请2小时后再试！！！！");
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
