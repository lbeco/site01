package com.controller;

import api.response.ArticleResponse;
import constant.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/article")
public class ArticleController {


    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HttpResponse<ArticleResponse> GetArticle(@PathVariable int id) {

        HttpResponse<ArticleResponse> httpResponse = new HttpResponse<>();
        httpResponse.setData(ArticleResponse.builder().title("第一回 甄士隐梦幻识通灵 贾雨村风尘怀闺秀").build());
        return httpResponse;
    }
}
