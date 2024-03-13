package com.example.dietchartmanagement.Services.HealthService;

import java.util.List;

import com.example.dietchartmanagement.Beans.healthdetail;

public interface healthdetailserviceimp {

    List<healthdetail> getAllEmployee();
    void save(healthdetail healthdetail);
    healthdetail getById(Long id);
    void deleteViaId(long id);
    
}
