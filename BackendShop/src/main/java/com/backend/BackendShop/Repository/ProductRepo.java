package com.backend.Shop.Repository;

import com.backend.Shop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, String> {
    Product findProductBy(String id);

}
