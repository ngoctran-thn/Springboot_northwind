package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Privilege;
import com.ngoc.northwind.repositories.PrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PrivilegeController {

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @GetMapping("/privileges")
    public Iterable<Privilege> getPrivileges(){
        return privilegeRepository.findAll();
    }


    @GetMapping("/privilege/{id}")
    public Optional<Privilege> getPrivilege(@PathVariable("id") int id){
        return privilegeRepository.findById(id);
    }

    @PostMapping("/privilege")
    public Privilege save(@RequestBody Privilege privilege){
        return privilegeRepository.save(privilege);
    }

    @PutMapping("/privilege")
    public Privilege update(@RequestBody Privilege privilege){
        return privilegeRepository.save(privilege);
    }

    @DeleteMapping("/privilege")
    public void delete(@RequestBody Privilege privilege){
        privilegeRepository.delete(privilege);
    }
}
