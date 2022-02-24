package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Integer> {
}