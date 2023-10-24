package com.example.thirddemo.controller;

import com.example.thirddemo.model.TempStock;
import com.example.thirddemo.repository.TempStockRepository;
import com.example.thirddemo.service.TempStockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class TempStockController {

    private TempStockRepository tempStockRepository;
    private TempStockService tempStockService;
    @GetMapping("/temp-stock/{id}")
    public ResponseEntity<TempStock> getTempStockById(@PathVariable Long id) {
        return tempStockService.getTempStock(id);
    }

    @PostMapping("/temp-stock")
    public TempStock createTempStock(@RequestBody TempStock tempStock) {
        return tempStockRepository.save(tempStock);
    }

    @PutMapping("/temp-stock/{id}")
    public ResponseEntity<TempStock> updateTempStock(@RequestBody TempStock tempStock) {
        return tempStockService.updateTempStock(tempStock);
    }

    @DeleteMapping("/temp-stock/{id}")
    public ResponseEntity<Void> deleteTempStock(@PathVariable Long tempStockId) {
        return tempStockService.deleteTempStock(tempStockId);
    }
}
