package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}
//
//	@Autowired
//	IProductService productService;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Product product = new Product(0, "spoon", "piegon", 200, "kitchen");
//
//		productService.addProduct(product);
//		

	}
