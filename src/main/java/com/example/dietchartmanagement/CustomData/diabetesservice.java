package com.example.dietchartmanagement.CustomData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class diabetesservice {

    @Autowired
    diabetesrepo drr;

    public void save(diabetesdata diabetesdata){
        drr.save(diabetesdata);
    }
    
    public List<diabetesdata> getAllEmployee()
    {
        return (List<diabetesdata>) drr.findAll();
    }
    
}
