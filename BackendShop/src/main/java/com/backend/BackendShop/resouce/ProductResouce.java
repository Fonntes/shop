package com.backend.Shop.resouce;

import com.backend.Shop.model.Product;
import com.backend.Shop.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/find/{id}")
    public ResponseEntity<Product> getProductsById(@PathVariable("id") String id) {
        Product products = productService.findProductById(id);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}