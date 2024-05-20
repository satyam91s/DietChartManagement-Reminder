package com.example.dietchartmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dietchartmanagement.Beans.appointment;

public interface appointmentrepo extends JpaRepository<appointment,Integer> {

    
}
