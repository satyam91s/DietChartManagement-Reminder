package com.example.dietchartmanagement.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "requestform")
public class healthform {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String requestNumber;
    private String name;
    private String email;
    private String mobileNumber;
    private String height;
    private String weight;
    private int age;
    private String goal;
    private String healthConditions;
    private String wakeupTime;
    private String sleepingTime;
    private String jobTime_from;
    private String jobTime_to;
    
    public healthform(int id, String requestNumber, String name, String email, String mobileNumber, String height,
            String weight, int age, String goal, String healthConditions, String wakeupTime, String sleepingTime,
            String jobTime_from, String jobTime_to) {
        this.id = id;
        this.requestNumber = requestNumber;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.goal = goal;
        this.healthConditions = healthConditions;
        this.wakeupTime = wakeupTime;
        this.sleepingTime = sleepingTime;
        this.jobTime_from = jobTime_from;
        this.jobTime_to = jobTime_to;
    }
    public healthform() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRequestNumber() {
        return requestNumber;
    }
    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
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
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGoal() {
        return goal;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }
    public String getHealthConditions() {
        return healthConditions;
    }
    public void setHealthConditions(String healthConditions) {
        this.healthConditions = healthConditions;
    }
    public String getWakeupTime() {
        return wakeupTime;
    }
    public void setWakeupTime(String wakeupTime) {
        this.wakeupTime = wakeupTime;
    }
    public String getSleepingTime() {
        return sleepingTime;
    }
    public void setSleepingTime(String sleepingTime) {
        this.sleepingTime = sleepingTime;
    }
    public String getJobTime_from() {
        return jobTime_from;
    }
    public void setJobTime_from(String jobTime_from) {
        this.jobTime_from = jobTime_from;
    }
    public String getJobTime_to() {
        return jobTime_to;
    }
    public void setJobTime_to(String jobTime_to) {
        this.jobTime_to = jobTime_to;
    }
    @Override
    public String toString() {
        return "healthform [id=" + id + ", requestNumber=" + requestNumber + ", name=" + name + ", email=" + email
                + ", mobileNumber=" + mobileNumber + ", height=" + height + ", weight=" + weight + ", age=" + age
                + ", goal=" + goal + ", healthConditions=" + healthConditions + ", wakeupTime=" + wakeupTime
                + ", sleepingTime=" + sleepingTime + ", jobTime_from=" + jobTime_from + ", jobTime_to=" + jobTime_to
                + "]";
    }
    
    
}
