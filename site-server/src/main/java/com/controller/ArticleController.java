package com.controller;

import api.response.ArticleResponse;
import com.entity.Article;
import com.service.ArticleService;
import constant.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HttpResponse<ArticleResponse> GetArticle(@PathVariable Integer id) {
        HttpResponse<ArticleResponse> httpResponse = new HttpResponse<>();
        Article article = articleService.getArticleByArticleId(id);
        httpResponse.setData(ArticleResponse.builder().title(article.getTitle()).main(article.getMain()).build());
        return httpResponse;
    }
}
