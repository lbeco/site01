package com.controller;

import com.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequiredArgsConstructor
public class TestController {
    @Autowired
    private final TestServiceImpl testService;

    public TestController(TestServiceImpl testService) {
        this.testService = testService;
    }

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return testService.test();
    }

}
