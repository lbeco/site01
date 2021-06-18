package com.service.impl;

import api.request.UserRequest;
import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User Sel(int id) {
        User user = userMapper.Sel(id);
        return user;
    }

    public void setUser(UserRequest userRequest) {
        User user = User.builder()
                .userName(userRequest.getUserName())
                .passWord(userRequest.getPassWord())
                .build();

        userMapper.insertUser(user);
    }
}
