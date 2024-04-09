package com.example.dietchartmanagement.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dietlist")
public class diet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String type, meal, mealtime;
    public diet(int id, String type, String meal, String mealtime) {
        this.id = id;
        this.type = type;
        this.meal = meal;
        this.mealtime = mealtime;
    }
    public diet() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getMealtime() {
        return mealtime;
    }
    public void setMealtime(String mealtime) {
        this.mealtime = mealtime;
    }
    @Override
    public String toString() {
        return "diet [id=" + id + ", type=" + type + ", meal=" + meal + ", mealtime=" + mealtime + "]";
    }
    
    
}
