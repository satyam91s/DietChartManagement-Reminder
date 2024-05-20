package com.example.dietchartmanagement.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointment")
public class appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    String appointment_no;
    String doctor_id,name,email,contact,message;
    public appointment(int id, String appointment_no, String doctor_id, String name, String email, String contact,
            String message) {
        this.id = id;
        this.appointment_no = appointment_no;
        this.doctor_id = doctor_id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.message = message;
    }
    public appointment() {
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "appointment [id=" + id + ", appointment_no=" + appointment_no + ", doctor_id=" + doctor_id + ", name="
                + name + ", email=" + email + ", contact=" + contact + ", message=" + message + "]";
    }

    
   

    
}
