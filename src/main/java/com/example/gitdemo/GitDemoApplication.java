package com.example.gitdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主启动类
 */
@MapperScan("com.example.gitdemo.mapper")
@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
