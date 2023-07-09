package com.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 小冯 on 2023/7/9 0:15
 */
@SpringBootApplication
@MapperScan("com.southwind.repository")
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
    }
}
