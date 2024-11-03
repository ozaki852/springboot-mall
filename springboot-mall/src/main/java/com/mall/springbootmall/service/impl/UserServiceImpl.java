package com.mall.springbootmall.service.impl;

import com.mall.springbootmall.dao.UserDao;
import com.mall.springbootmall.dto.UserRegisterRequest;
import com.mall.springbootmall.model.User;
import com.mall.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
