package com.example.thirddemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String quantity;
    private Instant lastRenewDate;
    private String price;
    private String supplierName;

    public Stock(Long id, String quantity, Instant lastRenewDate, String price, String supplierName) {
        this.id = id;
        this.quantity = quantity;
        this.lastRenewDate = lastRenewDate;
        this.price = price;
        this.supplierName = supplierName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Instant getLastRenewDate() {
        return lastRenewDate;
    }

    public void setLastRenewDate(Instant lastRenewDate) {
        this.lastRenewDate = lastRenewDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
