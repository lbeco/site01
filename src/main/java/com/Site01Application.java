package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("com.mapper")
@SpringBootApplication()
@EnableSwagger2
public class Site01Application {

    public static void main(String[] args) {
        SpringApplication.run(Site01Application.class, args);
    }

}
