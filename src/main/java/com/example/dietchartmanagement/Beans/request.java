package com.example.dietchartmanagement.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "requeststatus")
public class request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 

    private Long requestid; 
    private String Date_Time;
    private String status;

   
    public request(String date_Time, String status) {
        Date_Time = date_Time;
        this.status = status;
    }

    // Default constructor
    public request() {
    }

    public Long getRequestid() {
        return requestid;
    }

    public void setRequestid(Long requestid) {
        this.requestid = requestid;
    }

    public String getDate_Time() {
        return Date_Time;
    }

    public void setDate_Time(String date_Time) {
        Date_Time = date_Time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Request [requestid=" + requestid + ", Date_Time=" + Date_Time + ", status=" + status + "]";
    }
}
