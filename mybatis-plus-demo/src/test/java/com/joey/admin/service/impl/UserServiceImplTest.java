package com.joey.admin.service.impl;

import com.joey.admin.bean.entity.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    void userServiceTest(){
        UserDO userDO = userService.getById(1L);
        log.info(userDO.toString());
        Assertions.assertTrue(userDO!=null);
    }
}