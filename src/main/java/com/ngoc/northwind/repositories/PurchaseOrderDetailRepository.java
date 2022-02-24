package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.PurchaseOrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderDetailRepository extends CrudRepository<PurchaseOrderDetail, Integer> {
}