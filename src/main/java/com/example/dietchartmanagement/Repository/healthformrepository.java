package com.example.dietchartmanagement.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.dietchartmanagement.Beans.healthform;

public interface healthformrepository extends CrudRepository<healthform, Integer> {

    default void deleteViaId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteViaId'");
    }

    
} 