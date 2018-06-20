package com.joey.jpademo.controller;

import com.alibaba.fastjson.JSON;
import com.joey.jpademo.entity.Lombok;
import com.joey.jpademo.entity.User;
import com.joey.jpademo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Joey
 * @date 2018-06-19 16:46
 * @desc UserController
 **/
@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
    private final static Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;


    @GetMapping("/get/{id}")
    public String findUserById(@PathVariable Long id){
        User user=userService.getOne(id);
        logger.info("user");
        return JSON.toJSONString(user);
    }

    @GetMapping("/save")
    public String saveUser(){
        User user=new User("nnnn","qqq");
        userService.save(user);
        Lombok l=new Lombok(1,1);
        return "success";
    }
}
