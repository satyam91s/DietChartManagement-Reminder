package com.example.dietchartmanagement.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.dietchartmanagement.Beans.healthdetail;

public interface healthrepository extends CrudRepository<healthdetail, Integer>{
    
}
