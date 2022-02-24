package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}