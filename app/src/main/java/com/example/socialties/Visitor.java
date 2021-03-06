package com.example.socialties;

public class Visitor {

    private String name ;
    private String vnumber;
    private String address ;
    private String reason;

     public Visitor(){}
    public Visitor(String name, String vnumber, String address, String reason) {
        this.name = name;
        this.vnumber = vnumber;
        this.address = address;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVnumber() {
        return vnumber;
    }

    public void setVnumber(String vnumber) {
        this.vnumber = vnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
