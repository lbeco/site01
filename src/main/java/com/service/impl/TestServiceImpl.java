package com.service.impl;

import com.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    public String test(){
        List<String> list = new ArrayList<>();

        return "咬你！";
    }
}
