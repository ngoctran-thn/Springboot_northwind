package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.OrdersTaxStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrdersTaxStatusRepository extends CrudRepository<OrdersTaxStatus, Boolean> {
}