package com.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    private String id;

    @Indexed
    private Long articleId;

    private String title;

    private String main;

    private Date date;

    //省略了所有getter和setter方法

}
