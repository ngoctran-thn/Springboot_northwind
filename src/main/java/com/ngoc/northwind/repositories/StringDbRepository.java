package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.StringDb;
import org.springframework.data.repository.CrudRepository;

public interface StringDbRepository extends CrudRepository<StringDb, Integer> {
}