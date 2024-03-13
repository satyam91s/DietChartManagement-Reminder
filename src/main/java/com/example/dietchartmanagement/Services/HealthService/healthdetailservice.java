package com.example.dietchartmanagement.Services.HealthService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.dietchartmanagement.Beans.healthdetail;
import com.example.dietchartmanagement.Repository.healthrepository;

@Component
public class healthdetailservice implements healthdetailserviceimp {

    @Autowired
    healthrepository hr;

    public void save(healthdetail healthdetail) {
        hr.save(healthdetail);
    }



    public List<healthdetail> getAllEmployee()
    {
        return (List<healthdetail>) hr.findAll();
    }

    public healthdetail getById(int id)
    {
        Optional<healthdetail> optional = hr.findById(id);
        healthdetail healthdetail = null;
        if (optional.isPresent())
            healthdetail = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return healthdetail;
    }
 
     public void deleteViaId(int id)
    {
        hr.deleteById(id);
    }



    @Override
    public healthdetail getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }



    @Override
    public void deleteViaId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteViaId'");
    }
    
}
