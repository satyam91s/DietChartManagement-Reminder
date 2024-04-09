package com.example.dietchartmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dietchartmanagement.Beans.request;
import com.example.dietchartmanagement.Services.RequestService.requestservice;

@Controller
public class requestcontroller {
    @Autowired
    requestservice rs;

    // @PostMapping("/requeststatus")
    // public String requeststatus(@ModelAttribute("request") request request, Model model) {
    //     model.addAttribute("alldoctorlist", rs.getAllEmployee());
    //     return "doctorexpertiselist";
    // }
    
}
