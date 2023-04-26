package com.databaseproject.allthings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {		
		"com.databaseproject.allthings.services.ProductRepositoryImpl " })
public class AllthingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllthingsApplication.class, args);
	}
}
