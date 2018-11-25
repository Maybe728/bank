package com.cn.bank.model;

import java.util.Date;

public class Employee {
    private int id;
    private String employeeId;
    private String bankId;
    private String employeeName;
    private String identity;
    private String role;
    private String inCome;
    private String specialty;
    private Date inDate;
    private Date outDate;
    private Date workDate;
    private String address;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getInCome() {
        return inCome;
    }

    public void setInCome(String inCome) {
        this.inCome = inCome;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeId='" + employeeId + '\'' +
                ", bankId='" + bankId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", identity='" + identity + '\'' +
                ", role='" + role + '\'' +
                ", inCome='" + inCome + '\'' +
                ", specialty='" + specialty + '\'' +
                ", inDate=" + inDate +
                ", outDate=" + outDate +
                ", workDate=" + workDate +
                ", address='" + address + '\'' +
                '}';
    }
}
