package com.ngoc.northwind.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmployeePrivilegeId implements Serializable {
    private static final long serialVersionUID = 2917535775363886120L;
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;
    @Column(name = "privilege_id", nullable = false)
    private Integer privilegeId;

    public EmployeePrivilegeId() {
    }

    public EmployeePrivilegeId(Integer employeeId, Integer privilegeId) {
        this.employeeId = employeeId;
        this.privilegeId = privilegeId;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(privilegeId, employeeId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeePrivilegeId entity = (EmployeePrivilegeId) o;
        return Objects.equals(this.privilegeId, entity.privilegeId) &&
                Objects.equals(this.employeeId, entity.employeeId);
    }
}