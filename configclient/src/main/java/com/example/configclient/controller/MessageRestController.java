package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@RefreshScope
@RequestMapping(path = "/client")
public class MessageRestController {
	@Value("${app.welcome}")
	private String message;
	@GetMapping("/message")
	String getMessage() {
		return this.message;
	}
}
