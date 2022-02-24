package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.OrderDetailStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailStatusRepository extends CrudRepository<OrderDetailStatus, Integer> {
}