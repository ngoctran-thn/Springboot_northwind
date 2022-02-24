package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.InventoryTransaction;
import org.springframework.data.repository.CrudRepository;

public interface InventoryTransactionRepository extends CrudRepository<InventoryTransaction, Integer> {
}