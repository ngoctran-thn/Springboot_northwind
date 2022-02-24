package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.OrdersStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrdersStatusRepository extends CrudRepository<OrdersStatus, Boolean> {
}