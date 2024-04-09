package com.example.dietchartmanagement.Services.DietService;

import java.util.List;

import com.example.dietchartmanagement.Beans.diet;


public interface dietserviceimp {

     List<diet> getAllEmployee();
    void save(diet diet);
    diet getById(Long id);
    void deleteViaId(long id);
    
}
