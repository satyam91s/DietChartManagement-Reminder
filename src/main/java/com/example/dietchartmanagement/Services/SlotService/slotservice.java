package com.example.dietchartmanagement.Services.SlotService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dietchartmanagement.Beans.slot;
import com.example.dietchartmanagement.Repository.slotrepo;

@Component
public class slotservice {
    @Autowired
    slotrepo sr;

    public void save(slot slot){
        sr.save(slot);
    }

    public List<slot> getAllEmployee(){
        return (List<slot>) sr.findAll();
    }
    
    
}
