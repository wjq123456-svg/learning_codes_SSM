package com.itheima.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("default")
public class DefaultController {
    //返回字符串（返回值视图名称，数据使用Model接口）
    @RequestMapping("gotoResultModel")
    public String gotoResultModel(Model model){
        //封装数据
        model.addAttribute("nowDate",new Date() + "======================gotoResultModel");
        //返回页面
        return "result";
    }

    //返回字符串（返回值视图名称，数据使用ModelMap类）
    @RequestMapping("gotoResultModelMap")
    public String gotoResultModelMap(ModelMap modelMap){
        //封装数据
        //modelMap.addAttribute("nowDate",new Date() + "======================gotoResultModelMap");
        //返回页面
        return "result";
    }

    //返回VOID（使用Request对象，进行请求转发）
    @RequestMapping("gotoResultRequest")
    public void gotoResultRequest(HttpServletRequest request, HttpServletResponse response){
        //封装数据
        request.setAttribute("nowDate",new Date() + "======================gotoResultRequest");
        //请求转发
        try {
            request.getRequestDispatcher("/default/gotoResultModelMap.do").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //返回VOID（使用Response对象，进行页面的重定向）
    @RequestMapping("gotoResultResponse")
    public void gotoResultResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //封装数据
        request.setAttribute("nowDate",new Date() + "======================gotoResultResponse");
        response.sendRedirect(request.getContextPath()+"/default/gotoResultModelMap.do");
    }

    //返回String 通过SpringMVC格式，实现请求转发 不会执行SpringMVC中的视图解析器
    //SPringMVC中的请求转发格式：forward：请求转发的请求地址
    @RequestMapping("gotoResultForward")
    public String gotoResultForward(ModelMap modelMap){
        //封装数据
        modelMap.addAttribute("nowDate" ,new Date() + "==========gotoResultForward");
        return "forward:/default/gotoResultModelMap.do";
    }
    //返回String（通过SpringMVC格式，实现重定向 不会执行SpringMVC中的视图解析器）
    //SPringMVC中的重定向格式：redirect：请求转发的请求地址
    @RequestMapping("gotoResultRedirect")
    public String gotoResultRedirect(ModelMap modelMap)  {
        //封装数据
        /*request.setAttribute("nowDate",new Date() + "======================gotoResultRedirect");
        response.sendRedirect(request.getContextPath()+"/default/gotoResultModelMap.do");*/
        modelMap.addAttribute("nowDate",new Date() + "======================gotoResultRedirect");
        return "redirect:/default/gotoResultModelMap.do";
    }

}
