package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}