package com.cn.bank.model;

import java.io.Serializable;

public class Bank implements Serializable {

    private static final long serialVersionUID = 4695125176387802456L;
    private int id;
    private String bankName;
    private String bankId;
    private String bankAddress;
    private String bankLongitude;
    private String bankLatitude;
    private String employeeBankId;

    public String getEmployeeBankId() {
        return employeeBankId;
    }

    public void setEmployeeBankId(String employeeBankId) {
        this.employeeBankId = employeeBankId;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankId() {
        return bankId;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public String getBankLongitude() {
        return bankLongitude;
    }

    public String getBankLatitude() {
        return bankLatitude;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public void setBankLongitude(String bankLongitude) {
        this.bankLongitude = bankLongitude;
    }

    public void setBankLatitude(String bankLatitude) {
        this.bankLatitude = bankLatitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", bankId='" + bankId + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", bankLongitude='" + bankLongitude + '\'' +
                ", bankLatitude='" + bankLatitude + '\'' +
                ", employeeBankId='" + employeeBankId + '\'' +
                '}';
    }
}
