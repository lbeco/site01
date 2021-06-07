package com.controller;

import com.service.impl.TestServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@Controller
//@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    @Autowired
    private final TestServiceImpl testService;

    public TestController(TestServiceImpl testService) {
        this.testService = testService;
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return testService.test();
    }

    @ApiOperation("重定向")
    @RequestMapping(value = "redirect", method = RequestMethod.GET)
    @ResponseBody
    public void testRedirect(HttpServletRequest request, HttpServletResponse response, Writer out)
            throws IOException {
        response.sendRedirect("/user/getUser/3");
    }

}
