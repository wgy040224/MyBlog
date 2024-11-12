package com.sqnugy.myblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sqnugy.myblog.*"}) // 多模块项目中，必需手动指定扫描 com.sqnugy.myblog 包下面的所有类
public class MyblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogWebApplication.class, args);
    }

}
