package com.backend.Shop.service;

import com.backend.Shop.Repository.ProductRepo;
import com.backend.Shop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public Product findProductById(String id) {
            return productRepo.findProductBy(id);
                    //.orElseThrow(()-> new UserNotFoundException("user by id:" + id + " not found."));
    }

    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }

    public void deleteProduct(Product product) {
        productRepo.delete(product);
    }
}
