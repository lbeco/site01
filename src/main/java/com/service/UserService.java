package com.service;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        User user = userMapper.Sel(id);
        return user;
    }
}