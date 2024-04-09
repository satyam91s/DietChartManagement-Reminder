package com.example.dietchartmanagement.Services.DietService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dietchartmanagement.Beans.diet;
import com.example.dietchartmanagement.Repository.dietrepository;
@Component
public class dietservice implements dietserviceimp {

     @Autowired
      dietrepository dir;

    // public List<userdetail> getallBook() {

    //     List<userdetail> l = (List<userdetail>) ur.findAll();
    //     return l;
    // }

    public void save(diet diet) {
        dir.save(diet);
    }



    public List<diet> getAllEmployee()
    {
        return (List<diet>) dir.findAll();
    }

    public diet getById(int id)
    {
        Optional<diet> optional = dir.findById(id);
        diet diet = null;
        if (optional.isPresent())
            diet = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return diet;
    }
 
     public void deleteViaId(int id)
    {
        dir.deleteById(id);
    }



    @Override
    public diet getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }



    @Override
    public void deleteViaId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteViaId'");
    }
    
}
