package com.example.mybatis0;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatis0.mapper")
public class Mybatis0Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis0Application.class, args);
    }

}
