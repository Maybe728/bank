package com.cn.bank.model;

import java.util.List;

public class TempletResult {
    private String msg;
    private int code;
    private List<?> data;
    private int  count;

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public List<?> getData() {
        return data;
    }

    public int getCount() {
        return count;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "TempletResult{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                ", count=" + count +
                '}';
    }
}
