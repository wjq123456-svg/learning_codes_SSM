package com.itheima.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 *@Author wjq
 *@Date 2021/6/25
 *@Version v1.0
 *@Description 用户操作的控制器
 */
@Controller
@RequestMapping("user")
public class UserController {
    //用户登录方法
    @RequestMapping("login")
    public String login(String username, String password , HttpServletRequest request){
        //判断用户名密码是否匹配 （用户名：wangjinquan    密码：123）
        if("wangjinquan".equals(username) && "123".equals(password)){
            //如果匹配正确，向Session域中存入用户名，跳转页面到 登录成功后的页面main.jsp
            request.getSession().setAttribute("username",username);
            return "redirect:/account/findAll.do";
        }else {
            //匹配失败
            return "redirect:/index.jsp";
        }

    }
}
