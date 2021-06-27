package com.itheima.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@Author wjq
 *@Date 2021/6/25
 *@Version v1.0
 *@Description 自定义拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截用户请求，判断当前请求是否为登录请求  ，是则放行
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);
        //判断当前是否为 登录请求  是 则放行
        if ("/user/login.do".equals(requestURI)) {
            return true;
        }
        //其他请求，判断用户是否已经在Session域中存在
        Object username = request.getSession().getAttribute("username");
        if(username !=null){
            //信息在Session域中存在 ，放行
            return true;
        }
        else {
            //信息在Session域中不存在 ，拦截  跳转页面到  用户登录页面
            response.sendRedirect("/index.jsp");
            return false;
        }

    }
}
