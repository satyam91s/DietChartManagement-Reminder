package com.example.dietchartmanagement.Services;

import java.util.List;

import com.example.dietchartmanagement.Beans.user;

public interface userserviceimp {
    List<user> getAllEmployee();
    void save(user user);
    user getById(Long id);
    void deleteViaId(long id);
}
