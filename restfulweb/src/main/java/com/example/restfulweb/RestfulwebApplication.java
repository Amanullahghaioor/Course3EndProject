package com.example.restfulweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RestfulwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulwebApplication.class, args);
	}

}
