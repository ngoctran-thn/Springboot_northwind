package com.ngoc.northwind.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "purchase_order_details", indexes = {
        @Index(name = "inventory_id_2", columnList = "inventory_id"),
        @Index(name = "product_id", columnList = "product_id"),
        @Index(name = "purchase_order_id", columnList = "purchase_order_id")
})
public class PurchaseOrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "purchase_order_id", nullable = false)
    private PurchaseOrder purchaseOrders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product products;

    @Column(name = "quantity", nullable = false, precision = 18, scale = 4)
    private BigDecimal quantity;

    @Column(name = "unit_cost", nullable = false, precision = 19, scale = 4)
    private BigDecimal unitCost;

    @Column(name = "date_received")
    private Instant dateReceived;

    @Column(name = "posted_to_inventory", nullable = false)
    private Boolean postedToInventory = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_id")
    private InventoryTransaction inventoryTransactions;

    public InventoryTransaction getInventoryTransactions() {
        return inventoryTransactions;
    }

    public void setInventoryTransactions(InventoryTransaction inventoryTransactions) {
        this.inventoryTransactions = inventoryTransactions;
    }

    public Boolean getPostedToInventory() {
        return postedToInventory;
    }

    public void setPostedToInventory(Boolean postedToInventory) {
        this.postedToInventory = postedToInventory;
    }

    public Instant getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Instant dateReceived) {
        this.dateReceived = dateReceived;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public PurchaseOrder getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(PurchaseOrder purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}