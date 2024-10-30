package com.backend.BackendShop.resouce;

import com.backend.BackendShop.model.Product;
import com.backend.BackendShop.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductResouce {
    private final ProductService productService;

    public ProductResouce(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/addProduct")
    public void addStudent(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.findAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
