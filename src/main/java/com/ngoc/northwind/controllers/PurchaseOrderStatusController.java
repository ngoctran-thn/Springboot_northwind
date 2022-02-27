package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.PurchaseOrderStatus;
import com.ngoc.northwind.repositories.PurchaseOrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PurchaseOrderStatusController {

    @Autowired
    private PurchaseOrderStatusRepository purchaseOrderStatusRepository;

    @GetMapping("/purchaseOrderStatuss")
    public Iterable<PurchaseOrderStatus> getPurchaseOrderStatuss(){
        return purchaseOrderStatusRepository.findAll();
    }


    @GetMapping("/purchaseOrderStatus/{id}")
    public Optional<PurchaseOrderStatus> getPurchaseOrderStatus(@PathVariable("id") int id){
        return purchaseOrderStatusRepository.findById(id);
    }

    @PostMapping("/purchaseOrderStatus")
    public PurchaseOrderStatus save(@RequestBody PurchaseOrderStatus purchaseOrderStatus){
        return purchaseOrderStatusRepository.save(purchaseOrderStatus);
    }

    @PutMapping("/purchaseOrderStatus")
    public PurchaseOrderStatus update(@RequestBody PurchaseOrderStatus purchaseOrderStatus){
        return purchaseOrderStatusRepository.save(purchaseOrderStatus);
    }

    @DeleteMapping("/purchaseOrderStatus")
    public void delete(@RequestBody PurchaseOrderStatus purchaseOrderStatus){
        purchaseOrderStatusRepository.delete(purchaseOrderStatus);
    }
}
