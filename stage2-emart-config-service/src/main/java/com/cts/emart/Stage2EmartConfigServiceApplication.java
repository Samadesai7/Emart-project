package com.cts.emart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Stage2EmartConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stage2EmartConfigServiceApplication.class, args);
	}

}
