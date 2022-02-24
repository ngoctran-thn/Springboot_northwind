package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Order;
import com.ngoc.northwind.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public Iterable<Order> getOrders(){
        return orderRepository.findAll();
    }


    @GetMapping("/order/{id}")
    public Optional<Order> getOrder(@PathVariable("id") int id){
        return orderRepository.findById(id);
    }

    @PostMapping("/order")
    public Order save(@RequestBody Order order){
        return orderRepository.save(order);
    }

    @PutMapping("/order")
    public Order update(@RequestBody Order order){
        return orderRepository.save(order);
    }

    @DeleteMapping("/order")
    public void delete(@RequestBody Order order){
        orderRepository.delete(order);
    }
}
