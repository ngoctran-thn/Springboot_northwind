package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.Shipper;
import org.springframework.data.repository.CrudRepository;

public interface ShipperRepository extends CrudRepository<Shipper, Integer> {
}