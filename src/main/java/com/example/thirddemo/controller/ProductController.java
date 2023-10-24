package com.example.thirddemo.controller;

import com.example.thirddemo.model.Product;
import com.example.thirddemo.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.thirddemo.service.ProductService;

public class ProductController {

    private ProductRepository productRepository;
    private ProductService productService;
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductByProductId(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product updatedProduct) {
        return productService.updateProduct(updatedProduct);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        return productService.deleteProduct(productId);
    }
}
