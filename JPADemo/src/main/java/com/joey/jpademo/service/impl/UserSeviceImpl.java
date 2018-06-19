package com.joey.jpademo.service.impl;

import com.joey.jpademo.dao.UserDao;
import com.joey.jpademo.entity.User;
import com.joey.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Joey
 * @date 2018-06-19 16:34
 * @desc UserServiceImpl
 **/
@Service
public class UserSeviceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getOne(Long id) {
        return userDao.findUserById(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> findUserByUsernameEndsWith(String username, String end) {
        return userDao.findUserByUsernameEndsWith(username,end);
    }
}
