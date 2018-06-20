package com.joey.jpademo.service.impl;

import com.joey.jpademo.dao.UserDao;
import com.joey.jpademo.entity.User;
import com.joey.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Joey
 * @date 2018-06-19 16:34
 * @desc UserServiceImpl
 **/
@Service
@CacheConfig(cacheNames = "user")
public class UserSeviceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Cacheable
    @Override
    public User getOne(Long id) {
        return userDao.findUserById(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

}
