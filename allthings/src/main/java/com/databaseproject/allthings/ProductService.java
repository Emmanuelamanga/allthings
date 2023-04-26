package com.databaseproject.allthings;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int productId) throws NotFoundException {
        Optional<Product> product = productRepository.findById(Long.valueOf(productId));
        if (product.isPresent()) {
            return product.get();
        } else {
            throw new NotFoundException("Product not found with id " + productId);
        }
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(int productId) {
        productRepository.deleteById(Long.valueOf(productId));
    }

    public Product updateProduct(int productId, Product product) throws NotFoundException {
        Optional<Product> optionalProduct = productRepository.findById(Long.valueOf(productId));
        if (optionalProduct.isEmpty()) {
            throw new NotFoundException("Product not found with id " + productId);
        }

        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        Product existingProduct = optionalProduct.get();
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setUpdatedAt(localDateTime);

        return productRepository.save(existingProduct);
    }
}
