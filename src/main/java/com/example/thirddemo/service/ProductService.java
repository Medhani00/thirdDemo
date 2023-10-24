package com.example.thirddemo.service;

import com.example.thirddemo.model.Product;
import com.example.thirddemo.repository.ProductRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class ProductService {
    private ProductRepository productRepository;
    public ResponseEntity<Product> updateProduct(Product updatedProduct){

        if (!productRepository.existsById(updatedProduct.getId())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productRepository.save(updatedProduct));
    }

    public ResponseEntity<Void> deleteProduct(Long productId){

        if (!productRepository.existsById(productId)) {
            return ResponseEntity.notFound().build();
        }
        productRepository.deleteById(productId);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<Product> getProduct(Long productId){

        Optional<Product> product = productRepository.findById(productId);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
