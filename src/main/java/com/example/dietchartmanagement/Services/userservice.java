package com.example.dietchartmanagement.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dietchartmanagement.Beans.user;
import com.example.dietchartmanagement.Repository.userrepository;

@Component
public class userservice implements userserviceimp {
    @Autowired
    userrepository ur;

    // public List<userdetail> getallBook() {

    //     List<userdetail> l = (List<userdetail>) ur.findAll();
    //     return l;
    // }

    public void save(user user) {
        ur.save(user);
    }



    public List<user> getAllEmployee()
    {
        return (List<user>) ur.findAll();
    }

    public user getById(int id)
    {
        Optional<user> optional = ur.findById(id);
        user user = null;
        if (optional.isPresent())
            user = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return user;
    }
 
     public void deleteViaId(int id)
    {
        ur.deleteById(id);
    }



    @Override
    public user getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }



    @Override
    public void deleteViaId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteViaId'");
    }
}
