package com.databaseproject.allthings.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databaseproject.allthings.model.Product;
import com.databaseproject.allthings.repository.ProductRepository;
import com.databaseproject.allthings.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public void addProduct(Product product) {
        product.setCreatedAt(LocalDateTime.now());
        product.setUpdatedAt(LocalDateTime.now());
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        Product existingProduct = getProductById(product.getId());
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setUpdatedAt(LocalDateTime.now());
            productRepository.save(existingProduct);
        }
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }
}
