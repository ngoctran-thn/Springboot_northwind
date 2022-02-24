package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.Privilege;
import org.springframework.data.repository.CrudRepository;

public interface PrivilegeRepository extends CrudRepository<Privilege, Integer> {
}