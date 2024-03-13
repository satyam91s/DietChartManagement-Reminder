package com.example.dietchartmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dietchartmanagement.Beans.doctor;
import com.example.dietchartmanagement.Services.DoctorService.doctorservice;

@Controller
public class doctorcontroller {

    @Autowired
    doctorservice ds;

    @PostMapping("/doctorsave")
    public String savedoctor(@ModelAttribute("doctor") doctor doctor) {
        ds.save(doctor);
        return "redirect:/";
    }

    @GetMapping("/doctorregister")
    public String RegistrationDoctor(Model model) {
        model.addAttribute("doctor", new doctor());
        return "doctorregister";
    }

    @GetMapping("/doctorlogin")
    public String LoginDoctor(Model model) {
        model.addAttribute("doctor", new doctor());
        return "doctorlogin";
    }
    @GetMapping("/userlogin")
    public String Loginuser(Model model) {
        model.addAttribute("doctor", new doctor());
        return "login";
    }

    

    @GetMapping("/homedoctor")
    public String doctorhome() {

        return "doctorhome";
    }
    @GetMapping("/expertise")
    public String expertise() {

        return "doctorexpertise";
    }
    
}
