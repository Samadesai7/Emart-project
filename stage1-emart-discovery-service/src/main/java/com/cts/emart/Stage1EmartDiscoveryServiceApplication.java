package com.cts.emart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Stage1EmartDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stage1EmartDiscoveryServiceApplication.class, args);
	}

}
