package com.example.thirddemo.controller;

import com.example.thirddemo.model.Stock;
import com.example.thirddemo.repository.StockRepository;
import com.example.thirddemo.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class StockController {
    private StockRepository stockRepository;
    private StockService stockService;
    @GetMapping("/stock/{id}")
    public ResponseEntity<Stock> getStockById(@PathVariable Long id) {
        return stockService.getStock(id);
    }

    @PostMapping("/stock")
    public Stock createStock(@RequestBody Stock stock) {
        return stockRepository.save(stock);
    }

    @PutMapping("/stock/{id}")
    public ResponseEntity<Stock> updateStock(@RequestBody Stock updatedStock) {
        return stockService.updateStock(updatedStock);
    }

    @DeleteMapping("/stock/{id}")
    public ResponseEntity<Void> deleteStock(@PathVariable Long stockId) {
        return stockService.deleteStock(stockId);
    }
}
