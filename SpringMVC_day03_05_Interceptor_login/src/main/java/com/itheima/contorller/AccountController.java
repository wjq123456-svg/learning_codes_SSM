package com.itheima.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
@RequestMapping("account")
public class AccountController {
    @RequestMapping("/findAll")
    public String findAll(ModelMap modelMap){
        modelMap.addAttribute("nowDate","模拟查询所有账户操作");
        return "main";
    }

}
