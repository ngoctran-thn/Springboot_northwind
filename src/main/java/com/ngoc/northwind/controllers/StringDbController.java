package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.StringDb;
import com.ngoc.northwind.repositories.StringDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StringDbController {

    @Autowired
    private StringDbRepository stringDbRepository;

    @GetMapping("/stringDbs")
    public Iterable<StringDb> getStringDbs(){
        return stringDbRepository.findAll();
    }


    @GetMapping("/stringDb/{id}")
    public Optional<StringDb> getStringDb(@PathVariable("id") int id){
        return stringDbRepository.findById(id);
    }

    @PostMapping("/stringDb")
    public StringDb save(@RequestBody StringDb stringDb){
        return stringDbRepository.save(stringDb);
    }

    @PutMapping("/stringDb")
    public StringDb update(@RequestBody StringDb stringDb){
        return stringDbRepository.save(stringDb);
    }

    @DeleteMapping("/stringDb")
    public void delete(@RequestBody StringDb stringDb){
        stringDbRepository.delete(stringDb);
    }
}
