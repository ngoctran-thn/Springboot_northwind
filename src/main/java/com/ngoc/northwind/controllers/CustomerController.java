package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Customer;
import com.ngoc.northwind.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public Iterable<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> getCustomer(@PathVariable("id") int id){
        return customerRepository.findById(id);
    }

    @PostMapping("/customer")
    public Customer save(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @PutMapping("/customer")
    public Customer update(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @DeleteMapping("/customer")
    public void delete(@RequestBody Customer customer){
        customerRepository.delete(customer);
    }
}
