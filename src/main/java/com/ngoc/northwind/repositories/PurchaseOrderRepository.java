package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Integer> {
}