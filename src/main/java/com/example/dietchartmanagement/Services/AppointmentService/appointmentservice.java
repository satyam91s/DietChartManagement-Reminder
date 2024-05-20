package com.example.dietchartmanagement.Services.AppointmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dietchartmanagement.Beans.appointment;
import com.example.dietchartmanagement.Beans.diet;
import com.example.dietchartmanagement.Repository.appointmentrepo;

@Component
public class appointmentservice {
    @Autowired
    appointmentrepo ar;

     public void save(appointment appointment) {
        ar.save(appointment);
    }



    public List<appointment> getAllEmployee()
    {
        return (List<appointment>) ar.findAll();
    }

    public void deleteViaId(int id){
        ar.deleteById(id);
    }



    public void deletebyId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletebyId'");
    }


}
