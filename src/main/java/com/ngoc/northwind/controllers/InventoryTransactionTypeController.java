package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.InventoryTransactionType;
import com.ngoc.northwind.repositories.InventoryTransactionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class InventoryTransactionTypeController {

    @Autowired
    private InventoryTransactionTypeRepository inventoryTransactionTypeRepository;

    @GetMapping("/inventoryTransactionTypes")
    public Iterable<InventoryTransactionType> getInventoryTransactionTypes(){
        return inventoryTransactionTypeRepository.findAll();
    }


    @GetMapping("/inventoryTransactionType/{id}")
    public Optional<InventoryTransactionType> getInventoryTransactionType(@PathVariable("id") int id){
        return inventoryTransactionTypeRepository.findById(id);
    }

    @PostMapping("/inventoryTransactionType")
    public InventoryTransactionType save(@RequestBody InventoryTransactionType inventoryTransactionType){
        return inventoryTransactionTypeRepository.save(inventoryTransactionType);
    }

    @PutMapping("/inventoryTransactionType")
    public InventoryTransactionType update(@RequestBody InventoryTransactionType inventoryTransactionType){
        return inventoryTransactionTypeRepository.save(inventoryTransactionType);
    }

    @DeleteMapping("/inventoryTransactionType")
    public void delete(@RequestBody InventoryTransactionType inventoryTransactionType){
        inventoryTransactionTypeRepository.delete(inventoryTransactionType);
    }
}
