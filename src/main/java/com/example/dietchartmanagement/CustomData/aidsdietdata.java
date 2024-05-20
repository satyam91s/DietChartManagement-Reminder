package com.example.dietchartmanagement.CustomData;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aidsdietdata")
public class aidsdietdata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;
    String time,type,meal;
    
    public aidsdietdata(int id, String time, String type, String meal) {
        this.id = id;
        this.time = time;
        this.type = type;
        this.meal = meal;
    }
    public aidsdietdata() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getMeal() {
        return meal;
    }
    public void setMeal(String meal) {
        this.meal = meal;
    }
    @Override
    public String toString() {
        return "aidsdietdata [id=" + id + ", time=" + time + ", type=" + type + ", meal=" + meal + "]";
    }
    
    
}
