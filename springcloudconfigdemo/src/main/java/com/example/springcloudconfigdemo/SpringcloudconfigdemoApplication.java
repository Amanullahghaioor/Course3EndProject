package com.example.springcloudconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudconfigdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconfigdemoApplication.class, args);
	}

}
