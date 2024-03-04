package com.example.dietchartmanagement.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdetail")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;
    String name,email,password,role;
    long mobile;
    public user(int id, String name, String email, String password, String role, long mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.mobile = mobile;
    }
    public user() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    @Override
    public String toString() {
        return "user [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
                + ", mobile=" + mobile + "]";
    }
    
}
