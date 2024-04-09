package com.example.dietchartmanagement.Services.HealthformService;

import java.util.List;

import com.example.dietchartmanagement.Beans.healthform;

public interface healthformserviceimp {

     List<healthform> getAllEmployee();
    void save(healthform healthform);
    healthform getById(Long id);
    void deleteViaId(long id);

    
} 
