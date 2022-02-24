package com.ngoc.northwind.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders_status")
public class OrderStatus {
    @Id
    @Column(name = "id", nullable = false)
    private Boolean id = false;

    @Column(name = "status_name", nullable = false, length = 50)
    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Boolean getId() {
        return id;
    }

    public void setId(Boolean id) {
        this.id = id;
    }
}