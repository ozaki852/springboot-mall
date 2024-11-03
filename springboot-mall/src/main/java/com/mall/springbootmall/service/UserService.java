package com.mall.springbootmall.service;

import com.mall.springbootmall.dto.UserLoginRequest;
import com.mall.springbootmall.dto.UserRegisterRequest;
import com.mall.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
