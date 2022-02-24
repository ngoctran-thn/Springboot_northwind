
package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.OrderStatus;
import com.ngoc.northwind.repositories.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderStatusController {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @GetMapping("/orderStatuss")
    public Iterable<OrderStatus> getOrderStatuss(){
        return orderStatusRepository.findAll();
    }


    @GetMapping("/orderStatus/{id}")
    public Optional<OrderStatus> getOrderStatus(@PathVariable("id") int id){
        return orderStatusRepository.findById(id);
    }

    @PostMapping("/orderStatus")
    public OrderStatus save(@RequestBody OrderStatus orderStatus){
        return orderStatusRepository.save(orderStatus);
    }

    @PutMapping("/orderStatus")
    public OrderStatus update(@RequestBody OrderStatus orderStatus){
        return orderStatusRepository.save(orderStatus);
    }

    @DeleteMapping("/orderStatus")
    public void delete(@RequestBody OrderStatus orderStatus){
        orderStatusRepository.delete(orderStatus);
    }
}
