package com.example.appbuild.controller;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
public class HelloController {

	@GetMapping("/home")
	public String index() {
		return"Greetings from Spring Boot!";
	}
	
  @Bean
 public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
  return args -> {
   System.out.println("Let's inspect the beans provided by Spring Boot:");
   String[] beanNames = ctx.getBeanDefinitionNames();
   Arrays.sort(beanNames);
   for (String beanName : beanNames) {
    System.out.println(beanName);
   }
  };
 }
	
}
