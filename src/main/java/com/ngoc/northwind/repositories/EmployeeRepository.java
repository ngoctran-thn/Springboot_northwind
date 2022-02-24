package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}