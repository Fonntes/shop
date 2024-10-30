package com.backend.BackendShop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private double price;
    private int quantity;
    private GENDER gender;
    private double size;
    private String imageUrl;
    private String description;
    private int active;

    @Column(nullable = false, updatable = false)
    private String productCode;

    public Product() {}

    public Product(Long id, String name, double price, int quantity, GENDER gender, double size, String imageUrl, String description, int active, String productCode) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.gender = gender;
        this.size = size;
        this.imageUrl = imageUrl;
        this.description = description;
        this.active = active;
        this.productCode = productCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", gender=" + gender +
                ", size=" + size +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}
