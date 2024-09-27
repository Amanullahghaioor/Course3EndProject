package com.example.centralizedconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CentralizedconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizedconfigApplication.class, args);
	}

}
