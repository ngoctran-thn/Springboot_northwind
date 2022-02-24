package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.EmployeePrivilege;
import com.ngoc.northwind.entities.EmployeePrivilegeId;
import org.springframework.data.repository.CrudRepository;

public interface EmployeePrivilegeRepository extends CrudRepository<EmployeePrivilege, EmployeePrivilegeId> {
}