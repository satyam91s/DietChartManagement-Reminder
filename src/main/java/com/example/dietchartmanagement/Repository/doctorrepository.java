package com.example.dietchartmanagement.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.dietchartmanagement.Beans.doctor;

public interface doctorrepository extends CrudRepository <doctor, Integer> {
    
}
