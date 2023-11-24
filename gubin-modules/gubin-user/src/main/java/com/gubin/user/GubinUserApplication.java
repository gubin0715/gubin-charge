package com.gubin.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GubinUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GubinUserApplication.class, args);
    }

}
