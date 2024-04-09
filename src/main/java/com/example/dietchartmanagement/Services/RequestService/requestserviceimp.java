package com.example.dietchartmanagement.Services.RequestService;

import java.util.List;

import com.example.dietchartmanagement.Beans.request;

public interface requestserviceimp {
    List<request> getAllEmployee();
    void save(request request);
    request getById(Long id);
    void deleteViaId(long id);

}
