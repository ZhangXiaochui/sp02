package com.example.sp02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.sp02.mapper")
public class Sp02Application {

    public static void main(String[] args) {
        SpringApplication.run(Sp02Application.class, args);
    }

}
