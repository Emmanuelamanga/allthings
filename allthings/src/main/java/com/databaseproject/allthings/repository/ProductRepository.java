package com.databaseproject.allthings.repository;

import org.springframework.data.repository.CrudRepository;

import com.databaseproject.allthings.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findById(int productId);
    
    List<Product> findAll();

    Product findByName(String name);

    List<Product> findByUserId(int userId);

    List<Product> findByPriceBetween(double minPrice, double maxPrice);
}
