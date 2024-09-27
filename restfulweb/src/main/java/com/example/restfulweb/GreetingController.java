package com.example.restfulweb;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@controller
@RestController
public class GreetingController {
	//fields
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private GoodbyeService gbs;
	
	//method
	@GetMapping
	public Greeting greeting (@RequestParam(value = "name", defaultValue = "World") String name) {
		
		System.out.println(gbs.goodBye());
		return new Greeting(counter.incrementAndGet(), String.format(template, name)); //from java to JSON using Spring web/Jacks
		
	}
	
}
