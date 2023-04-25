package com.databaseproject.allthings;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.databaseproject.allthings.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findById(int productId);
    
    List<Product> findAll();

    Product findByName(String name);

    List<Product> findByUserId(int userId);

    List<Product> findByPriceBetween(double minPrice, double maxPrice);
}
