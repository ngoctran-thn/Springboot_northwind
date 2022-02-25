package com.ngoc.northwind.entities;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "orders_tax_status")
public class OrderTaxStatus {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "tax_status_name", nullable = false, length = 50)
    private String taxStatusName;

    @OneToMany(mappedBy = "ordersTaxStatus")
    private Set<Order> orders = new LinkedHashSet<>();

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public String getTaxStatusName() {
        return taxStatusName;
    }

    public void setTaxStatusName(String taxStatusName) {
        this.taxStatusName = taxStatusName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}