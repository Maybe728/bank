package com.cn.bank.model;

public class UpdateBankInfo {

    private int id;
    private String filed;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UpdateBankInfo{" +
                "id=" + id +
                ", filed='" + filed + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
