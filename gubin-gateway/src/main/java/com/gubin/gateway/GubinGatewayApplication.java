package com.gubin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GubinGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GubinGatewayApplication.class, args);
    }

}
