package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.InventoryTransaction;
import com.ngoc.northwind.repositories.InventoryTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class InventoryTransactionController {

    @Autowired
    private InventoryTransactionRepository inventoryTransactionRepository;

    @GetMapping("/inventoryTransactions")
    public Iterable<InventoryTransaction> getInventoryTransactions(){
        return inventoryTransactionRepository.findAll();
    }


    @GetMapping("/inventoryTransaction/{id}")
    public Optional<InventoryTransaction> getInventoryTransaction(@PathVariable("id") int id){
        return inventoryTransactionRepository.findById(id);
    }

    @PostMapping("/inventoryTransaction")
    public InventoryTransaction save(@RequestBody InventoryTransaction inventoryTransaction){
        return inventoryTransactionRepository.save(inventoryTransaction);
    }

    @PutMapping("/inventoryTransaction")
    public InventoryTransaction update(@RequestBody InventoryTransaction inventoryTransaction){
        return inventoryTransactionRepository.save(inventoryTransaction);
    }

    @DeleteMapping("/inventoryTransaction")
    public void delete(@RequestBody InventoryTransaction inventoryTransaction){
        inventoryTransactionRepository.delete(inventoryTransaction);
    }
}
