package com.controller;


import api.request.UserRequest;
import api.response.UserResponse;
import com.entity.User;
import com.service.UserService;
import constant.HttpResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private UserService userService;

    @ApiOperation("获取用户")
    @RequestMapping(value = "getUser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public HttpResponse<UserResponse> GetUser(@PathVariable int id) {
        User user = userService.Sel(id);
        UserResponse userResponse = UserResponse.builder()
                .name(user.getUserName())
                .height(user.getHeight())
                .birthday(user.getBirthday())
                .build();
        HttpResponse<UserResponse> httpResponse = new HttpResponse<>();
        httpResponse.setData(userResponse);
        return httpResponse;
    }

    @ApiOperation("利用id获取用户")
    @RequestMapping(value = "getUserById/", method = RequestMethod.GET)
    @ResponseBody
    public HttpResponse<UserResponse> GetUserById(@RequestParam int userId) {
        User user = userService.Sel(userId);
        UserResponse userResponse = UserResponse.builder()
                .name(user.getUserName())
                .height(user.getHeight())
                .birthday(user.getBirthday())
                .build();
        HttpResponse<UserResponse> httpResponse = new HttpResponse<>();
        httpResponse.setData(userResponse);
        return httpResponse;
    }

    @ApiOperation("设置用户")
    @RequestMapping(value = "/setUser", method = RequestMethod.POST)
    @ResponseBody
    public HttpResponse<?> addUser(@RequestBody UserRequest userRequest) {
        userService.setUser(userRequest);
        HttpResponse<UserResponse> httpResponse = new HttpResponse<>();
        return httpResponse;
    }

    @ApiOperation("测试servlet")
    @RequestMapping(value = "/testServletAPI",method = RequestMethod.POST)
    public void testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer out)
            throws IOException {
        System.out.println("testServletAPI,request:" + request + ",response:" + response);
        out.write("Hello SpringMVC");
    }


}
