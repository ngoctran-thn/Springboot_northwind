

package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.OrderDetailStatus;
import com.ngoc.northwind.repositories.OrderDetailStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderDetailStatusController {

    @Autowired
    private OrderDetailStatusRepository orderDetailStatusRepository;

    @GetMapping("/orderDetailStatuss")
    public Iterable<OrderDetailStatus> getOrderDetailStatuss(){
        return orderDetailStatusRepository.findAll();
    }


    @GetMapping("/orderDetailStatus/{id}")
    public Optional<OrderDetailStatus> getOrderDetailStatus(@PathVariable("id") int id){
        return orderDetailStatusRepository.findById(id);
    }

    @PostMapping("/orderDetailStatus")
    public OrderDetailStatus save(@RequestBody OrderDetailStatus orderDetailStatus){
        return orderDetailStatusRepository.save(orderDetailStatus);
    }

    @PutMapping("/orderDetailStatus")
    public OrderDetailStatus update(@RequestBody OrderDetailStatus orderDetailStatus){
        return orderDetailStatusRepository.save(orderDetailStatus);
    }

    @DeleteMapping("/orderDetailStatus")
    public void delete(@RequestBody OrderDetailStatus orderDetailStatus){
        orderDetailStatusRepository.delete(orderDetailStatus);
    }
}
