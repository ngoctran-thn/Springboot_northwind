package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.OrderDetailsStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsStatusRepository extends CrudRepository<OrderDetailsStatus, Integer> {
}