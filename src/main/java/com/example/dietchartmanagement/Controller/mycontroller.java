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
import com.example.dietchartmanagement.Services.userservice;
import com.example.dietchartmanagement.Services.DoctorService.doctorservice;
import com.example.dietchartmanagement.Services.HealthService.healthdetailservice;

@Controller
public class mycontroller {
    @Autowired
    userservice bs;
    @Autowired
    doctorservice ds;
    @Autowired
    healthdetailservice hr;

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
    @RequestMapping("/firsthome")
    public String firsthome() {
        return "firsthome";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/profile")
    public String viewHomePage(Model model) {
        model.addAttribute("allemplist", bs.getAllEmployee());
        return "profilee";
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
        return "redirect:/login";
    }

    // User details controller end

    // Doctor details controller start

    

    @GetMapping("/about")
    public String about() {

        return "about";
    }
    @GetMapping("/service")
    public String service() {

        return "services";
    }

    @GetMapping("/blog")
    public String blog() {

        return "blog";
    }

    @GetMapping("/contact")
    public String contact() {

        return "contact";
    }
    @GetMapping("/reminder")
    public String reminder() {

        return "Notavailable";
    }


    //test
    @GetMapping("/test")
    public String test(){
        return "navbar";
    }
}
