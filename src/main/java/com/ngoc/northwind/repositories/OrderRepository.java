package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}