package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Invoice;
import com.ngoc.northwind.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceRepository InvoiceRepository;

    //Try http://localhost:8080/invoices
    @GetMapping("/invoices")
    public Iterable<Invoice> getInvoices(){
        return InvoiceRepository.findAll();
    }

    //Try http://localhost/invoice/2
    @GetMapping("/invoice/{id}")
    public Optional<Invoice> getInvoice(@PathVariable("id") int id){
        return InvoiceRepository.findById(id);
    }

    @PostMapping("/invoice")
    //Use postman and url http://localhost/profle, method POST and put {"name":"Test"} in body
    public Invoice save(@RequestBody Invoice invoice){
        return InvoiceRepository.save(invoice);
    }

    //update = save
    @PutMapping("/invoice")
    //Use postman and url http://localhost/profile, method PUT and put {"id":6, "name":"Test2"} in body
    public Invoice update(@RequestBody Invoice invoice){
        return InvoiceRepository.save(invoice);
    }

    @DeleteMapping("/invoice")
    //Use postman and url http://localhost/profle, method DELETE and put {"id":6} in body
    public void delete(@RequestBody Invoice invoice){
        InvoiceRepository.delete(invoice);
    }
}
