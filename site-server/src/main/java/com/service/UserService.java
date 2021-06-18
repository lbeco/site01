package com.service;

import api.request.UserRequest;
import com.entity.User;


public interface UserService {

    public User Sel(int id);

    public void setUser(UserRequest userRequest);
}