package com.cts.emart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SellerActionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerActionServiceApplication.class, args);
	}

}
