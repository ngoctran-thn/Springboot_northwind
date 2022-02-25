
package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.OrderTaxStatus;
import com.ngoc.northwind.repositories.OrderTaxStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderTaxStatusController {

    @Autowired
    private OrderTaxStatusRepository orderTaxStatusRepository;

    @GetMapping("/orderTaxStatuses")
    public Iterable<OrderTaxStatus> getOrderTaxStatuses(){
        return orderTaxStatusRepository.findAll();
    }

    @GetMapping("/orderTaxStatus/{id}")
    public Optional<OrderTaxStatus> getOrderTaxStatus(@PathVariable("id") int id){
        return orderTaxStatusRepository.findById(id);
    }

    @PostMapping("/orderTaxStatus")
    public OrderTaxStatus save(@RequestBody OrderTaxStatus orderTaxStatus){
        return orderTaxStatusRepository.save(orderTaxStatus);
    }

    @PutMapping("/orderTaxStatus")
    public OrderTaxStatus update(@RequestBody OrderTaxStatus orderTaxStatus){
        return orderTaxStatusRepository.save(orderTaxStatus);
    }

    @DeleteMapping("/orderTaxStatus")
    public void delete(@RequestBody OrderTaxStatus orderTaxStatus){
        orderTaxStatusRepository.delete(orderTaxStatus);
    }
}
