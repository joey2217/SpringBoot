package com.joey.admin.controller;

import com.joey.admin.bean.entity.UserDO;
import com.joey.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

/**
 * @author EDZ
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable Long id) {
        UserDO userDO = userService.getById(id);
        if (userDO == null) {
            throw new HttpClientErrorException(HttpStatus.CONFLICT, "ID为" + id + "的员工不存在!");
        }
        return ResponseEntity.ok(userDO);
    }
}
