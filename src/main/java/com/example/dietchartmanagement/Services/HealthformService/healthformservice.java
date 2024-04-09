package com.example.dietchartmanagement.Services.HealthformService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dietchartmanagement.Beans.healthform;
import com.example.dietchartmanagement.Repository.healthformrepository;

@Component
public class healthformservice {
    @Autowired
    healthformrepository hf;

    public void save(healthform healthform) {
        hf.save(healthform);
    }



    public List<healthform> getAllEmployee()
    {
        return (List<healthform>) hf.findAll();
    }

    public healthform getById(int id)
    {
        Optional<healthform> optional = hf.findById(id);
        healthform user = null;
        if (optional.isPresent())
            user = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return user;
    }
 
     public void deleteViaId(int id)
    {
        hf.deleteById(id);
    }



   
    
}
