package com.example.socialties;

public class Visitor {

    private String name ;
    private String vnumber;
    private String address ;
    private String reason;
    private String date;
    private String time;
    private String serialno;
    private String remarks ;

  public Visitor()
  {

  }
   public Visitor(String name, String vnumber, String address, String reason, String date, String time, String serialno, String remarks) {
        this.name = name;
        this.vnumber = vnumber;
        this.address = address;
        this.reason = reason;
        this.date = date;
        this.time= time ;
        this.serialno = serialno;
       this.remarks= remarks;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


}
