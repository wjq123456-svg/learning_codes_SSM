package com.itheima.contorller;

import com.itheima.contorller.pojo.QueryVo;
import com.itheima.contorller.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *@Author wjq
 *@Date 2021/6/18
 *@Version v1.0
 *@Description 业务处理的控制器，包含了多个处理器的方法
 */
@Controller
@RequestMapping("params")
public class ParamsController {
    //功能一：默认支持ServletAPI
    @RequestMapping("gotoParams")
    public ModelAndView gotoParams(HttpServletRequest request, HttpServletResponse response,ModelAndView modelAndView){
        //获取浏览器地址栏中的id参数和name参数的值
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"==="+id+"==="+name);
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
    //功能二：绑定简单属性类型(浏览器地址栏中参数名应与Handler方法的参数名一致)
    @RequestMapping("gotoParamsBase")
    public ModelAndView gotoParamsBase(Integer id,String name,ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"==="+id+"==="+name);
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

    //功能三：当形参和传递的参数名称不一致时使用RequestParam进行手动映射
    @RequestMapping("gotoParamsRequestParam")
    public ModelAndView gotoParamsRequestParam(@RequestParam("ids") Integer id, ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"==="+id);
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

    //功能四：绑定pojo对象，，要求浏览器地址栏参数名必须与pojo属性名一致
    @RequestMapping("gotoParamsPojo")
    public ModelAndView gotoParamsPojo(User user, ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"==="+user);
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

    //功能五：绑定pojo对象的包装对象，，
    @RequestMapping("gotoParamsQueryVo")
    public ModelAndView gotoParamsQueryVo(QueryVo queryVo, ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"==="+queryVo);
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
    //功能六：绑定pojo对象的list集合，，
    @RequestMapping("gotoParamsList")
    public ModelAndView gotoParamsList(QueryVo queryVo, ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"==="+queryVo);
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
    //功能七：绑定pojo对象的Map集合，，
    @RequestMapping("gotoParamsMap")
    public ModelAndView gotoParamsMap(QueryVo queryVo, ModelAndView modelAndView){
        //指定数据
        modelAndView.addObject("nowDate", new Date()+"==="+queryVo);
        //指定页面
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
