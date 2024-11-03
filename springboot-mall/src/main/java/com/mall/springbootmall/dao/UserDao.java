package com.mall.springbootmall.dao;

import com.mall.springbootmall.dto.UserRegisterRequest;
import com.mall.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
