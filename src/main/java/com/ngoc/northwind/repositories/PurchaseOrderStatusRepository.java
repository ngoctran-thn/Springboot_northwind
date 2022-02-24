package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.PurchaseOrderStatus;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderStatusRepository extends CrudRepository<PurchaseOrderStatus, Integer> {
}