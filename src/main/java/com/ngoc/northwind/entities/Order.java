package com.ngoc.northwind.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "orders", indexes = {
        @Index(name = "tax_status", columnList = "tax_status_id"),
        @Index(name = "employee_id_2", columnList = "employee_id"),
        @Index(name = "ship_zip_postal_code", columnList = "ship_zip_postal_code"),
        @Index(name = "customer_id_2", columnList = "customer_id"),
        @Index(name = "shipper_id", columnList = "shipper_id")
})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customers;

    @Column(name = "order_date")
    private Instant orderDate;

    @Column(name = "shipped_date")
    private Instant shippedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipper_id")
    private Shipper shippers;

    @Column(name = "ship_name", length = 50)
    private String shipName;

    @Lob
    @Column(name = "ship_address")
    private String shipAddress;

    @Column(name = "ship_city", length = 50)
    private String shipCity;

    @Column(name = "ship_state_province", length = 50)
    private String shipStateProvince;

    @Column(name = "ship_zip_postal_code", length = 50)
    private String shipZipPostalCode;

    @Column(name = "ship_country_region", length = 50)
    private String shipCountryRegion;

    @Column(name = "shipping_fee", precision = 19, scale = 4)
    private BigDecimal shippingFee;

    @Column(name = "taxes", precision = 19, scale = 4)
    private BigDecimal taxes;

    @Column(name = "payment_type", length = 50)
    private String paymentType;

    @Column(name = "paid_date")
    private Instant paidDate;

    @Lob
    @Column(name = "notes")
    private String notes;

    @Column(name = "tax_rate")
    private Double taxRate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tax_status_id")
    private OrderTaxStatus ordersTaxStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private OrderStatus ordersStatus;

    @OneToMany(mappedBy = "orders")
    private Set<InventoryTransaction> inventoryTransactions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "orders")
    private Set<OrderDetail> orderDetails = new LinkedHashSet<>();

    @OneToMany(mappedBy = "orders")
    private Set<Invoice> invoices = new LinkedHashSet<>();

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Set<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Set<InventoryTransaction> getInventoryTransactions() {
        return inventoryTransactions;
    }

    public void setInventoryTransactions(Set<InventoryTransaction> inventoryTransactions) {
        this.inventoryTransactions = inventoryTransactions;
    }

    public OrderStatus getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(OrderStatus ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    public OrderTaxStatus getOrdersTaxStatus() {
        return ordersTaxStatus;
    }

    public void setOrdersTaxStatus(OrderTaxStatus ordersTaxStatus) {
        this.ordersTaxStatus = ordersTaxStatus;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Instant getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Instant paidDate) {
        this.paidDate = paidDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getShipCountryRegion() {
        return shipCountryRegion;
    }

    public void setShipCountryRegion(String shipCountryRegion) {
        this.shipCountryRegion = shipCountryRegion;
    }

    public String getShipZipPostalCode() {
        return shipZipPostalCode;
    }

    public void setShipZipPostalCode(String shipZipPostalCode) {
        this.shipZipPostalCode = shipZipPostalCode;
    }

    public String getShipStateProvince() {
        return shipStateProvince;
    }

    public void setShipStateProvince(String shipStateProvince) {
        this.shipStateProvince = shipStateProvince;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public Shipper getShippers() {
        return shippers;
    }

    public void setShippers(Shipper shippers) {
        this.shippers = shippers;
    }

    public Instant getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Instant shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}