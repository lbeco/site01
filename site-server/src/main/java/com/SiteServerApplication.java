package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("com.mapper")
@SpringBootApplication()
@EnableSwagger2
public class SiteServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiteServerApplication.class, args);
    }

}
