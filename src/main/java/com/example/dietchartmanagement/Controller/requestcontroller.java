package com.example.dietchartmanagement.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dietchartmanagement.Beans.request;
import com.example.dietchartmanagement.Services.RequestService.requestservice;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class requestcontroller {
    @Autowired
    requestservice rs;

    // @GetMapping("/dietgenerate")
    // public String requeststatus(Model model){

    //     model.addAttribute("currentdate", new Date());
    //     model.addAttribute("status", "pending");
    //     return "doctorexpertiselist";
    // }

    
    
}
