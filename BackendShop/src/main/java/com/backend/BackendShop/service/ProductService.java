package com.backend.BackendShop.service;

import com.backend.BackendShop.Repository.ProductRepo;
import com.backend.BackendShop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product addProduct(Product product) {
        product.setProductCode(UUID.randomUUID().toString());
        return productRepo.save(product);
    }

    public List<Product> findAllProducts() {
        return productRepo.findAll();
    }
}
