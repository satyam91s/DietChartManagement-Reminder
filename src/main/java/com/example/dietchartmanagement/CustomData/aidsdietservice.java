package com.example.dietchartmanagement.CustomData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class aidsdietservice {

    @Autowired
    aidsdietrepo arr;

    public void save(aidsdietdata aidsdietdata){
        arr.save(aidsdietdata);
    }
    
    public List<aidsdietdata> getAllEmployee()
    {
        return (List<aidsdietdata>) arr.findAll();
    }
    
}
