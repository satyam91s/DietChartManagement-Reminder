package com.example.dietchartmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dietchartmanagement.Beans.doctor;
import com.example.dietchartmanagement.Beans.healthdetail;
import com.example.dietchartmanagement.Beans.user;
import com.example.dietchartmanagement.Services.doctorservice;
import com.example.dietchartmanagement.Services.healthdetailservice;
import com.example.dietchartmanagement.Services.userservice;

@Controller
public class mycontroller {
    @Autowired
    userservice bs;
    @Autowired
    doctorservice ds;
    @Autowired
    healthdetailservice hr;


    
    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/profile")
    public String viewHomePage(Model model) {
        model.addAttribute("allemplist", bs.getAllEmployee());
        return "profile";
    }

    // User details controller start

    @GetMapping("/register")
     public String RegistrationForm(Model model) {
    model.addAttribute("user", new user());
    return "register";
}
    @GetMapping("/login")
     public String LoginForm(Model model) {
    model.addAttribute("user", new user());
    return "login";
}
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("user") user user) {
        bs.save(user);
        return "redirect:/";
    }

    // User details controller end

    // Doctor details controller start

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
    return "login";
}
    @GetMapping("/about")
     public String about() {
    
    return "about";
}
    @GetMapping("/contact")
     public String contact() {
    
    return "contact";
}

// Doctor detail controller end

// Health detail controller start
@PostMapping("/healthsave")
    public String healthsave(@ModelAttribute("healthdetail") healthdetail healthdetail) {
        hr.save(healthdetail);
        return "redirect:/";
    }

    @GetMapping("/healthform")
     public String healthform(Model model) {
    model.addAttribute("healthdetail", new healthdetail());
    return "healthdetail";
}
// Health detail controller end
    
}
