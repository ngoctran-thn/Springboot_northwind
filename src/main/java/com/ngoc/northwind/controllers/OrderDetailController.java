package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.OrderDetail;
import com.ngoc.northwind.repositories.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderDetailController {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @GetMapping("/orderDetails")
    public Iterable<OrderDetail> getOrderDetails(){
        return orderDetailRepository.findAll();
    }


    @GetMapping("/orderDetail/{id}")
    public Optional<OrderDetail> getOrderDetail(@PathVariable("id") int id){
        return orderDetailRepository.findById(id);
    }

    @PostMapping("/orderDetail")
    public OrderDetail save(@RequestBody OrderDetail orderDetail){
        return orderDetailRepository.save(orderDetail);
    }

    @PutMapping("/orderDetail")
    public OrderDetail update(@RequestBody OrderDetail orderDetail){
        return orderDetailRepository.save(orderDetail);
    }

    @DeleteMapping("/orderDetail")
    public void delete(@RequestBody OrderDetail orderDetail){
        orderDetailRepository.delete(orderDetail);
    }
}
