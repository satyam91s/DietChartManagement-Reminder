package com.example.dietchartmanagement.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "healthdetail")
public class healthdetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     
    private int id;
    private float height;
    private int weight;

    private int age;
    private String healthgoal;
    private String healthcondition;
    private String location;
    
    public healthdetail(int id, float height, int weight, int age, String healthgoal, String healthcondition,
            String location) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.healthgoal = healthgoal;
        this.healthcondition = healthcondition;
        this.location = location;
    }
    public healthdetail() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getHealthgoal() {
        return healthgoal;
    }
    public void setHealthgoal(String healthgoal) {
        this.healthgoal = healthgoal;
    }
    public String getHealthcondition() {
        return healthcondition;
    }
    public void setHealthcondition(String healthcondition) {
        this.healthcondition = healthcondition;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "healthdetail [id=" + id + ", height=" + height + ", weight=" + weight + ", age=" + age + ", healthgoal="
                + healthgoal + ", healthcondition=" + healthcondition + ", location=" + location + "]";
    }



    
}
