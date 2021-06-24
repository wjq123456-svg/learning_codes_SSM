package com.itheima.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller +@ResponseBody =@RestController
public class UserController {
    //查询
    @RequestMapping(value = "user/{id}" ,method = RequestMethod.GET)
    public String find(@PathVariable("id") Integer ids){
        System.out.println("find-----"+ids);

        return "result";
    }

    //新增
    @RequestMapping(value = "user/{id}",method = RequestMethod.POST)
    public String save(@PathVariable("id") Integer ids){
        System.out.println("save-----"+ids);
        return "result";
    }

    //更新（put）
    @RequestMapping(value = "user/{id}",method = RequestMethod.PUT)
    public String update(@PathVariable("id") Integer ids){
        System.out.println("update-----"+ids);
        return "result";
    }

    //删除
    @RequestMapping(value = "user/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer ids){
        System.out.println("delete-----"+ids);
        return "result";
    }
}
