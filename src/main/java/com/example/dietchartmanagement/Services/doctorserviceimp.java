package com.example.dietchartmanagement.Services;

import java.util.List;

import com.example.dietchartmanagement.Beans.doctor;
public interface doctorserviceimp {

    List<doctor> getAllEmployee();
    void save(doctor doctor);
    doctor getById(Long id);
    void deleteViaId(long id);
    
}
