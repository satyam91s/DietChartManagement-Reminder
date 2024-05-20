package com.example.dietchartmanagement.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.weaver.patterns.ConcreteCflowPointcut.Slot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dietchartmanagement.Beans.appointment;
import com.example.dietchartmanagement.Beans.doctor;
import com.example.dietchartmanagement.Beans.healthform;
import com.example.dietchartmanagement.Beans.request;
import com.example.dietchartmanagement.Beans.slot;
import com.example.dietchartmanagement.Services.userservice;
import com.example.dietchartmanagement.Services.AppointmentService.appointmentservice;
import com.example.dietchartmanagement.Services.DoctorService.doctorservice;
import com.example.dietchartmanagement.Services.HealthformService.healthformservice;
import com.example.dietchartmanagement.Services.RequestService.requestservice;
import com.example.dietchartmanagement.Services.SlotService.slotservice;

@Controller
public class doctorcontroller {

    @Autowired
    doctorservice ds;
    @Autowired
    userservice us;
    @Autowired
    healthformservice hfs;
    @Autowired
    requestservice rs;
    @Autowired
    appointmentservice as;
    @Autowired
    slotservice ss;

    @PostMapping("/doctorsave")
    public String savedoctor(@ModelAttribute("doctor") doctor doctor) {
        ds.save(doctor);
        return "redirect:/doctorlogin";
    }

    @PostMapping("/healthformsave")
    public String healthformsaved(@ModelAttribute("healthform") healthform healthForm,
            @ModelAttribute("request") request request,
            Model model) {
        // Save health form and request
        hfs.save(healthForm);
        rs.save(request);

        // Add attributes to the model
        model.addAttribute("alldoctorlist", ds.getAllEmployee());
        model.addAttribute("requestList", rs.getAllEmployee()); // Assuming this returns a list of requests

        // Return the view name
        return "doctorexpertiselist";
    }

    @GetMapping("/doctorregister")
    public String RegistrationDoctor(Model model) {
        model.addAttribute("doctor", new doctor());
        return "doctorregister";
    }
    @GetMapping("/doctorprofile")
    public String doctorprofile(Model model) {
        model.addAttribute("doctor", new doctor());
        return "doctorprofile";
    }
    @GetMapping("/doctorblog")
    public String doctorblog(Model model) {
        model.addAttribute("doctor", new doctor());
        return "doctorblog";
    }
    @GetMapping("/content")
    public String content(Model model) {
        model.addAttribute("doctor", new doctor());
        return "content";
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
    public String viewdoctorHomePage(Model model) {
        model.addAttribute("alldoctorlist", ds.getAllEmployee());

    model.addAttribute("showappoint", as.getAllEmployee());
    model.addAttribute("appointment", new appointment()); // Add the "appointment" object to the model
    model.addAttribute("slot", new slot());
    model.addAttribute("currentDateTime", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
    return "doctorexpertise";
        
    }

    @GetMapping("/patient")
    public String patientlist(Model model) {
        model.addAttribute("allpatientlist", us.getAllEmployee());
        return "patientlist";
    }

    @GetMapping("/dietgenerate")
    public String dietgenerate(Model model) {
        model.addAttribute("alldoctorlist", ds.getAllEmployee());
        model.addAttribute("healthform", new healthform());
        return "doctorexpertiselist";
    }

    @GetMapping("/healthform")
    public String requestMethodName(Model model) {
        model.addAttribute("healthform", new healthform());
        return "form";
    }
    @GetMapping("/viewpatientdata")
    public String viewdata(Model model) {
        model.addAttribute("allpatientdetail", hfs.getAllEmployee());
        return "patientdata";
    }

}
