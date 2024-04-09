package com.example.dietchartmanagement.Services.RequestService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dietchartmanagement.Beans.request;
import com.example.dietchartmanagement.Repository.requestrepository;
@Component
public class requestservice implements requestserviceimp {

    @Autowired
    requestrepository rr;
    
    public void save(request request) {
        rr.save(request);
    }



    public List<request> getAllEmployee()
    {
        return (List<request>) rr.findAll();
    }

    public request getById(int id)
    {
        Optional<request> optional = rr.findById(id);
        request request = null;
        if (optional.isPresent())
            request = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return request;
    }
 
     public void deleteViaId(int id)
    {
        rr.deleteById(id);
    }



    @Override
    public request getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }



    @Override
    public void deleteViaId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteViaId'");
    }
}
