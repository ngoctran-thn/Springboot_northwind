package com.ngoc.northwind.entities;

import javax.persistence.*;

@Entity
@Table(name = "strings")
public class String {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "string_id", nullable = false)
    private Integer id;

    @Column(name = "string_data")
    private java.lang.String stringData;

    public java.lang.String getStringData() {
        return stringData;
    }

    public void setStringData(java.lang.String stringData) {
        this.stringData = stringData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}