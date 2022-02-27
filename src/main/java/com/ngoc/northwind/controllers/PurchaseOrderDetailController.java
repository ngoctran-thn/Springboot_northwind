package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.PurchaseOrderDetail;
import com.ngoc.northwind.repositories.PurchaseOrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PurchaseOrderDetailController {

    @Autowired
    private PurchaseOrderDetailRepository purchaseOrderDetailRepository;

    @GetMapping("/purchaseOrderDetails")
    public Iterable<PurchaseOrderDetail> getPurchaseOrderDetails(){
        return purchaseOrderDetailRepository.findAll();
    }


    @GetMapping("/purchaseOrderDetail/{id}")
    public Optional<PurchaseOrderDetail> getPurchaseOrderDetail(@PathVariable("id") int id){
        return purchaseOrderDetailRepository.findById(id);
    }

    @PostMapping("/purchaseOrderDetail")
    public PurchaseOrderDetail save(@RequestBody PurchaseOrderDetail purchaseOrderDetail){
        return purchaseOrderDetailRepository.save(purchaseOrderDetail);
    }

    @PutMapping("/purchaseOrderDetail")
    public PurchaseOrderDetail update(@RequestBody PurchaseOrderDetail purchaseOrderDetail){
        return purchaseOrderDetailRepository.save(purchaseOrderDetail);
    }

    @DeleteMapping("/purchaseOrderDetail")
    public void delete(@RequestBody PurchaseOrderDetail purchaseOrderDetail){
        purchaseOrderDetailRepository.delete(purchaseOrderDetail);
    }
}
