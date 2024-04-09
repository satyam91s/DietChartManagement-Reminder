package com.example.dietchartmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dietchartmanagement.Beans.diet;

public interface dietrepository extends JpaRepository<diet, Integer> {
    
}
