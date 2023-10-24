package com.example.thirddemo.service;

import com.example.thirddemo.model.Product;
import com.example.thirddemo.model.Stock;
import com.example.thirddemo.repository.StockRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class StockService {
    private StockRepository stockRepository;
    public ResponseEntity<Stock> updateStock(Stock updatedStock){

        if (!stockRepository.existsById(updatedStock.getId())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(stockRepository.save(updatedStock));
    }

    public ResponseEntity<Void> deleteStock(Long stockId){

        if (!stockRepository.existsById(stockId)) {
            return ResponseEntity.notFound().build();
        }
        stockRepository.deleteById(stockId);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<Stock> getStock(Long stockId){

        Optional<Stock> product = stockRepository.findById(stockId);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
