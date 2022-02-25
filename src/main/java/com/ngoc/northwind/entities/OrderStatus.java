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
    private Integer id;

    @Column(name = "status_name", nullable = false, length = 50)
    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}