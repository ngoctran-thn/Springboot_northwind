package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.OrderTaxStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrderTaxStatusRepository extends CrudRepository<OrderTaxStatus, Integer> {
}