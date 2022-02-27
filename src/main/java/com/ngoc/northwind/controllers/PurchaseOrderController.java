package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.PurchaseOrder;
import com.ngoc.northwind.repositories.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @GetMapping("/purchaseOrders")
    public Iterable<PurchaseOrder> getPurchaseOrders(){
        return purchaseOrderRepository.findAll();
    }


    @GetMapping("/purchaseOrder/{id}")
    public Optional<PurchaseOrder> getPurchaseOrder(@PathVariable("id") int id){
        return purchaseOrderRepository.findById(id);
    }

    @PostMapping("/purchaseOrder")
    public PurchaseOrder save(@RequestBody PurchaseOrder purchaseOrder){
        return purchaseOrderRepository.save(purchaseOrder);
    }

    @PutMapping("/purchaseOrder")
    public PurchaseOrder update(@RequestBody PurchaseOrder purchaseOrder){
        return purchaseOrderRepository.save(purchaseOrder);
    }

    @DeleteMapping("/purchaseOrder")
    public void delete(@RequestBody PurchaseOrder purchaseOrder){
        purchaseOrderRepository.delete(purchaseOrder);
    }
}
