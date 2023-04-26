package com.databaseproject.allthings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @SpringBootApplication(scanBasePackages = { "com.*" })
@ComponentScan(basePackages = { "com.databaseproject.allthings.ProductService" })
// @ComponentScan("com.databaseproject.allthings")
public class AllthingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllthingsApplication.class, args);
	}

}
