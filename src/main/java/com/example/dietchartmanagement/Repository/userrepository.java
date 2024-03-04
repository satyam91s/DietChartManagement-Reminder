package com.example.dietchartmanagement.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.dietchartmanagement.Beans.user;

public interface userrepository extends CrudRepository<user, Integer> {

    // @Query("select u from user where u.email= :email")
    // public user getuserByName(@Param("email") String name);
    
}
