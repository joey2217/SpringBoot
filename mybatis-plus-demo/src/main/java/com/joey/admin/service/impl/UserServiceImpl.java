package com.joey.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joey.admin.bean.entity.UserDO;
import com.joey.admin.mapper.UserMapper;
import com.joey.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Joey
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,UserDO> implements UserService {
}
