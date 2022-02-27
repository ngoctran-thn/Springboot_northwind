package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Product;
import com.ngoc.northwind.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public Iterable<Product> getProducts(){
        return productRepository.findAll();
    }


    @GetMapping("/product/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int id){
        return productRepository.findById(id);
    }

    @PostMapping("/product")
    public Product save(@RequestBody Product product){
        return productRepository.save(product);
    }

    @PutMapping("/product")
    public Product update(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/product")
    public void delete(@RequestBody Product product){
        productRepository.delete(product);
    }
}
