package com.joey.mybatisdemo.entity;

import lombok.Data;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Joey
 * @date 2018-06-21 13:53
 * @desc User
 **/
@Data
public class User implements Serializable {

    private Long id;

    private  String username;

    private  String password;
}
