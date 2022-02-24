package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, Integer> {
}