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
        Article article = articleRepository.findByArticleId((long) articleId);
        articleRepository.findAll();
        return article;
    }
}
