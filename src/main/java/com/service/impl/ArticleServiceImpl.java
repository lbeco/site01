package com.service.impl;

import com.entity.Article;
import com.service.ArticleService;
import com.service.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public Article getArticleByArticleId(Integer articleId) {
        Article article = Article.builder().articleId((long)2).title("123").main("123").build();
        // Article article = articleRepository.findByArticleId((long) articleId);
        articleRepository.save(article);
        articleRepository.findAll();
        return article;
    }
}
