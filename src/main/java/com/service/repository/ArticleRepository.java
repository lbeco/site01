package com.service.repository;

import com.entity.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {
    @Override
    List<Article> findAll();

    Article findByArticleId(Long articleId);

}
