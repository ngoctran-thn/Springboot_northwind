package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.String;
import org.springframework.data.repository.CrudRepository;

public interface StringRepository extends CrudRepository<String, Integer> {
}