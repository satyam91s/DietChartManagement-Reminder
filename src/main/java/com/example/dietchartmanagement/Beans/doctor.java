package com.example.dietchartmanagement.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctordetail")
public class doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private String qualification;
    private String specialization;
    private int experience;
    private String clinicName;
    private String clinicAddress;
    private String clinicTime;
    private String mobile;
    private String certificate;
    private String gender;
    private String country;
    private String city;

    public doctor(int id, String name, int age, String email, String password, String qualification,
            String specialization, int experience, String clinicName, String clinicAddress, String clinicTime,
            String mobile, String certificate, String gender, String country, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.qualification = qualification;
        this.specialization = specialization;
        this.experience = experience;
        this.clinicName = clinicName;
        this.clinicAddress = clinicAddress;
        this.clinicTime = clinicTime;
        this.mobile = mobile;
        this.certificate = certificate;
        this.gender = gender;
        this.country = country;
        this.city = city;
    }

    public doctor() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getClinicTime() {
        return clinicTime;
    }

    public void setClinicTime(String clinicTime) {
        this.clinicTime = clinicTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "doctor [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password=" + password
                + ", qualification=" + qualification + ", specialization=" + specialization + ", experience="
                + experience + ", clinicName=" + clinicName + ", clinicAddress=" + clinicAddress + ", clinicTime="
                + clinicTime + ", mobile=" + mobile + ", certificate=" + certificate + ", gender=" + gender
                + ", country=" + country + ", city=" + city + "]";
    }

}
