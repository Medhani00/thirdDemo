package com.example.thirddemo.service;

import com.example.thirddemo.model.TempStock;
import com.example.thirddemo.repository.TempStockRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class TempStockService {
    private TempStockRepository tempStockRepository;
    public ResponseEntity<TempStock> updateTempStock(TempStock tempStock){

        if (!tempStockRepository.existsById(tempStock.getId())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tempStockRepository.save(tempStock));
    }

    public ResponseEntity<Void> deleteTempStock(Long tempStockId){

        if (!tempStockRepository.existsById(tempStockId)) {
            return ResponseEntity.notFound().build();
        }
        tempStockRepository.deleteById(tempStockId);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<TempStock> getTempStock(Long tempStockId){

        Optional<TempStock> tempStock = tempStockRepository.findById(tempStockId);
        return tempStock.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
