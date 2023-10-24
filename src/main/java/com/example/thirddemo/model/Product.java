package com.example.thirddemo.model;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private Instant manufactureDate;
    private Instant expireDate;
    private Instant date;
    private String description;
    private String extra;

    public Product(Long id, String productName, Instant manufactureDate, Instant expireDate, Instant date,
                   String description, String extra) {
        this.id = id;
        this.productName = productName;
        this.manufactureDate = manufactureDate;
        this.expireDate = expireDate;
        this.date = date;
        this.description = description;
        this.extra = extra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Instant getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Instant manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Instant getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Instant expireDate) {
        this.expireDate = expireDate;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}