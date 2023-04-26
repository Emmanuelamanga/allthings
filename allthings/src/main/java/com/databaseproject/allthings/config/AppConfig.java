package com.databaseproject.allthings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.databaseproject.allthings.repository.ProductRepository;

@Configuration
public class AppConfig {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepositoryImpl();
    }
}
