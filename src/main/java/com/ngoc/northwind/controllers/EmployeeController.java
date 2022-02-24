package com.ngoc.northwind.controllers;

import com.ngoc.northwind.entities.Invoice;
import com.ngoc.northwind.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @GetMapping("/invoices")
    public Iterable<Invoice> getInvoices(){
        return invoiceRepository.findAll();
    }


    @GetMapping("/invoice/{id}")
    public Optional<Invoice> getInvoice(@PathVariable("id") int id){
        return invoiceRepository.findById(id);
    }

    @PostMapping("/invoice")
    public Invoice save(@RequestBody Invoice invoice){
        return invoiceRepository.save(invoice);
    }

    @PutMapping("/invoice")
    public Invoice update(@RequestBody Invoice invoice){
        return invoiceRepository.save(invoice);
    }

    @DeleteMapping("/invoice")
    public void delete(@RequestBody Invoice invoice){
        invoiceRepository.delete(invoice);
    }
}
