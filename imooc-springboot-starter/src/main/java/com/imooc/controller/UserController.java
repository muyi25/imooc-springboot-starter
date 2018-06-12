package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;
import com.imooc.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Resource resource;

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setName("imooc");
        user.setAge(18);
        user.setPassword("123456");
        user.setBirthday(new Date());
        user.setDesc(null);
        return user;
    }

    @RequestMapping("/getUserJson")
    public IMoocJSONResult getUserJson(){
        User user = new User();
        user.setName("imooc");
        user.setAge(18);
        user.setPassword("123456");
        user.setBirthday(new Date());
        user.setDesc("111111111111");
        return IMoocJSONResult.ok(user);
    }


    @RequestMapping("/getResource")
    public IMoocJSONResult getResource() {

        Resource bean  = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return IMoocJSONResult.ok(bean);
    }
}
