package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.SalesReport;
import com.ngoc.northwind.repositories.SalesReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SalesReportController {

    @Autowired
    private SalesReportRepository salesReportRepository;

    @GetMapping("/salesReports")
    public Iterable<SalesReport> getSalesReports(){
        return salesReportRepository.findAll();
    }


    @GetMapping("/salesReport/{id}")
    public Optional<SalesReport> getSalesReport(@PathVariable("id") String id){
        return salesReportRepository.findById(id);
    }

    @PostMapping("/salesReport")
    public SalesReport save(@RequestBody SalesReport salesReport){
        return salesReportRepository.save(salesReport);
    }

    @PutMapping("/salesReport")
    public SalesReport update(@RequestBody SalesReport salesReport){
        return salesReportRepository.save(salesReport);
    }

    @DeleteMapping("/salesReport")
    public void delete(@RequestBody SalesReport salesReport){
        salesReportRepository.delete(salesReport);
    }
}
