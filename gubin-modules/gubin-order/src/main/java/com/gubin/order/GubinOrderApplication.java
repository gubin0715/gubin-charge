package com.gubin.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GubinOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(GubinOrderApplication.class, args);
	}

}
