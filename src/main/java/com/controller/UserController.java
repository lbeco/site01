package com.controller;


import api.response.UserResponse;
import com.alibaba.fastjson.JSONObject;
import com.service.UserService;
import constant.HttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
@Slf4j
public class UserController {
    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    @ResponseBody
    public HttpResponse<UserResponse> GetUser(@PathVariable int id) {
        appContext.getApplicationName();
        String str = JSONObject.toJSONString(userService.Sel(id));
        UserResponse userResponse = new UserResponse();
        userResponse.setResult("气气");
        HttpResponse<UserResponse> httpResponse = new HttpResponse<>();
        httpResponse.setData(userResponse);
        return httpResponse;

    }
}
