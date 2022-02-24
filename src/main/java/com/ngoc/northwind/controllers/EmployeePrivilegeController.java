package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.EmployeePrivilege;
import com.ngoc.northwind.repositories.EmployeePrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeePrivilegeController {

    @Autowired
    private EmployeePrivilegeRepository employeePrivilegeRepository;

    @GetMapping("/employeePrivileges")
    public Iterable<EmployeePrivilege> getEmployeePrivileges(){
        return employeePrivilegeRepository.findAll();
    }


    @GetMapping("/employeePrivilege/{id}")
    public Optional<EmployeePrivilege> getEmployeePrivilege(@PathVariable("id") int id){
        return employeePrivilegeRepository.findById(id);
    }

    @PostMapping("/employeePrivilege")
    public EmployeePrivilege save(@RequestBody EmployeePrivilege employeePrivilege){
        return employeePrivilegeRepository.save(employeePrivilege);
    }

    @PutMapping("/employeePrivilege")
    public EmployeePrivilege update(@RequestBody EmployeePrivilege employeePrivilege){
        return employeePrivilegeRepository.save(employeePrivilege);
    }

    @DeleteMapping("/employeePrivilege")
    public void delete(@RequestBody EmployeePrivilege employeePrivilege){
        employeePrivilegeRepository.delete(employeePrivilege);
    }
}
