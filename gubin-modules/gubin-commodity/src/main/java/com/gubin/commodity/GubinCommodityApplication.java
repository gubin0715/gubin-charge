package com.gubin.commodity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GubinCommodityApplication {

    public static void main(String[] args) {
        SpringApplication.run(GubinCommodityApplication.class, args);
    }

}
