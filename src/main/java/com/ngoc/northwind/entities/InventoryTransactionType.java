package com.ngoc.northwind.entities;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "inventory_transaction_types")
public class InventoryTransactionType {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type_name", nullable = false, length = 50)
    private String typeName;

    @OneToMany(mappedBy = "inventoryTransactionTypes")
    private Set<InventoryTransaction> inventoryTransactions = new LinkedHashSet<>();

    public Set<InventoryTransaction> getInventoryTransactions() {
        return inventoryTransactions;
    }

    public void setInventoryTransactions(Set<InventoryTransaction> inventoryTransactions) {
        this.inventoryTransactions = inventoryTransactions;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}