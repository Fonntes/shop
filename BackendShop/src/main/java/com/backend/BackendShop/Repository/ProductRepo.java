package com.backend.BackendShop.Repository;

import com.backend.BackendShop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, String> {
    Product findProductBy(String id);
}
