package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@MapperScan("com.mapper")
@SpringBootApplication()
public class Site01Application {

	public static void main(String[] args) {
		SpringApplication.run(Site01Application.class, args);
	}

}
