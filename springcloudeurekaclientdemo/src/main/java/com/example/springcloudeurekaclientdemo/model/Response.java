package com.example.springcloudeurekaclientdemo.model;

import java.util.ArrayList;

public class Response {
	
	private Integer code;
	private String message;
	private ArrayList<Product> products;
	public Response() {
		super();
	}
	public Response(Integer code, String message, ArrayList<Product> products) {
		super();
		this.code = code;
		this.message = message;
		this.products = products;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", products=" + products + "]";
	}
	
	
}