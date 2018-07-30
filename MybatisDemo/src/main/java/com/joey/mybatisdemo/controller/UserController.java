package com.joey.mybatisdemo.controller;

import com.alibaba.fastjson.JSON;
import com.joey.mybatisdemo.dao.UserDao;
import com.joey.mybatisdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joey
 * @date 2018-06-21 14:07
 * @desc UserController
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/get/{id}")
    public  String get(@PathVariable Long id){
        User user =userDao.get(id);
        return JSON.toJSONString(user);
    }
}
