package com.ngoc.northwind.entities;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "purchase_order_status")
public class PurchaseOrderStatus {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "status", length = 50)
    private String status;

    @OneToMany(mappedBy = "purchaseOrderStatus")
    private Set<PurchaseOrder> purchaseOrders = new LinkedHashSet<>();

    public Set<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}