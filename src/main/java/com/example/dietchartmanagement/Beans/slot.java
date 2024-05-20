package com.example.dietchartmanagement.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="slot")
public class slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String appointment_no,doctor_id,date_time,select_shift,select_slot;
    public slot(int id, String appointment_no, String doctor_id, String date_time, String select_shift,
            String select_slot) {
        this.id = id;
        this.appointment_no = appointment_no;
        this.doctor_id = doctor_id;
        this.date_time = date_time;
        this.select_shift = select_shift;
        this.select_slot = select_slot;
    }
    public slot() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAppointment_no() {
        return appointment_no;
    }
    public void setAppointment_no(String appointment_no) {
        this.appointment_no = appointment_no;
    }
    public String getDoctor_id() {
        return doctor_id;
    }
    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }
    public String getDate_time() {
        return date_time;
    }
    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }
    public String getSelect_shift() {
        return select_shift;
    }
    public void setSelect_shift(String select_shift) {
        this.select_shift = select_shift;
    }
    public String getSelect_slot() {
        return select_slot;
    }
    public void setSelect_slot(String select_slot) {
        this.select_slot = select_slot;
    }
    @Override
    public String toString() {
        return "slot [id=" + id + ", appointment_no=" + appointment_no + ", doctor_id=" + doctor_id + ", date_time="
                + date_time + ", select_shift=" + select_shift + ", select_slot=" + select_slot + "]";
    }

    

    
}
