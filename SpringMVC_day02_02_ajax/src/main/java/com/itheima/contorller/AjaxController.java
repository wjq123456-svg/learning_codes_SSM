package com.itheima.contorller;


import com.itheima.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@Controller +@ResponseBody =@RestController
@Controller
@RequestMapping("ajax")
public class AjaxController {
    public List<User> textAjax(User user){
        return null;
    }
}
