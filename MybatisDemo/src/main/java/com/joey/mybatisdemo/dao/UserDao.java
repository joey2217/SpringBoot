package com.joey.mybatisdemo.dao;

import com.joey.mybatisdemo.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Joey
 * @date 2018-06-21 13:53
 * @desc UserDao
 **/
@Component
public interface UserDao {
    /**
     * get one user
     * @param id
     * @return
     */
    User get(Long id);
}

