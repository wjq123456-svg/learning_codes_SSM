package com.itheima.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class DefaultController {
    @RequestMapping("update")
    public String upload(MultipartFile multipartFile, HttpServletRequest request){
        //获取32位的随机字符串
        String uuid = UUID.randomUUID().toString().replace("-", " ");
        System.out.println("uuid = " + uuid);

        //获取上传文件的名称
        String originalFilename = multipartFile.getOriginalFilename();
        //System.out.println("originalFilename = " + originalFilename);
        
        //获取到上传文件存储的upload文件夹路径
        String realPath = request.getSession().getServletContext().getRealPath("upload");
        System.out.println("realPath = " + realPath);
        
        //组装要上传文件的完整路径
        File path = new File(realPath, uuid+"_"+originalFilename);
        System.out.println("path = " + path);

        //上传文件
        try {
            multipartFile.transferTo(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "result";
    }
}
