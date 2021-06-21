package com.itheima.contorller.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 *@Author wjq
 *@Date 2021/6/21
 *@Version v1.0
 *@Description Query value Object 对页面查询之进行封装的类
 */
@Data
public class QueryVo {
    private  User user;
    private List<User> userList;
    private Map<String,User> userMap;

}
