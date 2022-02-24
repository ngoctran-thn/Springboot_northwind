package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Employee;
import com.ngoc.northwind.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }


    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable("id") int id){
        return employeeRepository.findById(id);
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/employee")
    public void delete(@RequestBody Employee employee){
        employeeRepository.delete(employee);
    }
}
