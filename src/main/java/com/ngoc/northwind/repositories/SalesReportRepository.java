package com.ngoc.northwind.repositories;

import com.ngoc.northwind.entities.SalesReport;
import org.springframework.data.repository.CrudRepository;

public interface SalesReportRepository extends CrudRepository<SalesReport, String> {
}