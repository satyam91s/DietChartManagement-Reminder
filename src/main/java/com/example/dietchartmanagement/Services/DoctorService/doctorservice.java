package com.example.dietchartmanagement.Services.DoctorService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dietchartmanagement.Beans.doctor;
import com.example.dietchartmanagement.Repository.doctorrepository;
 @Component
public class doctorservice implements doctorserviceimp {

    @Autowired
    doctorrepository dr;
    
    // public List<doctordetail> getallBook() {

    //     List<doctordetail> l = (List<doctordetail>) dr.findAll();
    //     return l;
    // }

    public void save(doctor doctor) {
        dr.save(doctor);
    }



    public List<doctor> getAllEmployee()
    {
        return (List<doctor>) dr.findAll();
    }

    public doctor getById(int id)
    {
        Optional<doctor> optional = dr.findById(id);
        doctor doctor = null;
        if (optional.isPresent())
            doctor = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return doctor;
    }
 
     public void deleteViaId(int id)
    {
        dr.deleteById(id);
    }



    @Override
    public doctor getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }



    @Override
    public void deleteViaId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteViaId'");
    }
    
}
