package com.cn.bank.model;

import java.util.Date;

public class Employee {
    private int id;
    private String employeeId;
    private String employeeBankId;
    private String employeeName;
    private String employeeIdentity;
    private String employeeRole;
    private String employeeInCome;
    private String employeeSpecialty;
    private Date employeeInDate;
    private Date employeeOutDate;
    private Date employeeWorkDate;
    private String employeeAddress;

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

    public String getEmployeeBankId() {
        return employeeBankId;
    }

    public void setEmployeeBankId(String employeeBankId) {
        this.employeeBankId = employeeBankId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeIdentity() {
        return employeeIdentity;
    }

    public void setEmployeeIdentity(String employeeIdentity) {
        this.employeeIdentity = employeeIdentity;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public String getEmployeeInCome() {
        return employeeInCome;
    }

    public void setEmployeeInCome(String employeeInCome) {
        this.employeeInCome = employeeInCome;
    }

    public String getEmployeeSpecialty() {
        return employeeSpecialty;
    }

    public void setEmployeeSpecialty(String employeeSpecialty) {
        this.employeeSpecialty = employeeSpecialty;
    }

    public Date getEmployeeInDate() {
        return employeeInDate;
    }

    public void setEmployeeInDate(Date employeeInDate) {
        this.employeeInDate = employeeInDate;
    }

    public Date getEmployeeOutDate() {
        return employeeOutDate;
    }

    public void setEmployeeOutDate(Date employeeOutDate) {
        this.employeeOutDate = employeeOutDate;
    }

    public Date getEmployeeWorkDate() {
        return employeeWorkDate;
    }

    public void setEmployeeWorkDate(Date employeeWorkDate) {
        this.employeeWorkDate = employeeWorkDate;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeId='" + employeeId + '\'' +
                ", employeeBankId='" + employeeBankId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeIdentity='" + employeeIdentity + '\'' +
                ", employeeRole='" + employeeRole + '\'' +
                ", employeeInCome='" + employeeInCome + '\'' +
                ", employeeSpecialty='" + employeeSpecialty + '\'' +
                ", employeeInDate=" + employeeInDate +
                ", employeeOutDate=" + employeeOutDate +
                ", employeeWorkDate=" + employeeWorkDate +
                ", employeeAddress='" + employeeAddress + '\'' +
                '}';
    }
}
