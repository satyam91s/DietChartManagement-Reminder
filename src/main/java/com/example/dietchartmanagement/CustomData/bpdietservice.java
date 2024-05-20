package com.example.dietchartmanagement.CustomData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bpdietservice {
    @Autowired
    bpdietrepo br;

    public void save(bpdietdata bpdietdata){
        br.save(bpdietdata);
    }
    
    public List<bpdietdata> getAllEmployee()
    {
        return (List<bpdietdata>) br.findAll();
    }
}
