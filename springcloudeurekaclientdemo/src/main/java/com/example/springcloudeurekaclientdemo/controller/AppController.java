package com.example.springcloudeurekaclientdemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloudeurekaclientdemo.model.Product;
import com.example.springcloudeurekaclientdemo.model.Response;

@RestController
@RequestMapping(path="/app")
public class AppController {
	
	@GetMapping("/products")
	public Response getProducts() {
		
		
		Product p1 = new Product("Apple Watch", 3000);
		Product p2= new Product("Apple MacBook", 17000);
		
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		System.out.println(products);
		
		Response response = new Response(101, "Products Fetched Successfully", products);
		return response;
		
		
	}
}
