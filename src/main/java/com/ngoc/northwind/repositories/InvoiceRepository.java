package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {
}