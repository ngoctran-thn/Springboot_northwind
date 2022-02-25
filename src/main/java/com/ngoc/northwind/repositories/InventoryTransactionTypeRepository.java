package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.InventoryTransactionType;
import org.springframework.data.repository.CrudRepository;

public interface InventoryTransactionTypeRepository extends CrudRepository<InventoryTransactionType,Integer> {
}