package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.OrderStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrderStatusRepository extends CrudRepository<OrderStatus, Boolean> {
}