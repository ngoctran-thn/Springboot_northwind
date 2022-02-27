package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Shipper;
import com.ngoc.northwind.repositories.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ShipperController {

    @Autowired
    private ShipperRepository shipperRepository;

    @GetMapping("/shippers")
    public Iterable<Shipper> getShippers(){
        return shipperRepository.findAll();
    }


    @GetMapping("/shipper/{id}")
    public Optional<Shipper> getShipper(@PathVariable("id") int id){
        return shipperRepository.findById(id);
    }

    @PostMapping("/shipper")
    public Shipper save(@RequestBody Shipper shipper){
        return shipperRepository.save(shipper);
    }

    @PutMapping("/shipper")
    public Shipper update(@RequestBody Shipper shipper){
        return shipperRepository.save(shipper);
    }

    @DeleteMapping("/shipper")
    public void delete(@RequestBody Shipper shipper){
        shipperRepository.delete(shipper);
    }
}
