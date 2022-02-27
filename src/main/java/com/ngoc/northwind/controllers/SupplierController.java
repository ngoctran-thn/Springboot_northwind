package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Supplier;
import com.ngoc.northwind.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @GetMapping("/suppliers")
    public Iterable<Supplier> getSuppliers(){
        return supplierRepository.findAll();
    }


    @GetMapping("/supplier/{id}")
    public Optional<Supplier> getSupplier(@PathVariable("id") int id){
        return supplierRepository.findById(id);
    }

    @PostMapping("/supplier")
    public Supplier save(@RequestBody Supplier supplier){
        return supplierRepository.save(supplier);
    }

    @PutMapping("/supplier")
    public Supplier update(@RequestBody Supplier supplier){
        return supplierRepository.save(supplier);
    }

    @DeleteMapping("/supplier")
    public void delete(@RequestBody Supplier supplier){
        supplierRepository.delete(supplier);
    }
}
