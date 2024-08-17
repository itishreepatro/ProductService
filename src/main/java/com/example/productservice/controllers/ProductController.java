package com.example.productservice.controllers;

import com.example.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    //localhost:8080/products/12
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return new Product();
    }

    //localhost:8080/products
    @GetMapping
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    //create a product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }

    //Update Product,partial update
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Product product) {
        return new Product();
    }

    //Replace Product
    @PatchMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id,@RequestBody Product product) {
        return new Product();
    }

    //Delete product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        return;
    }
}
