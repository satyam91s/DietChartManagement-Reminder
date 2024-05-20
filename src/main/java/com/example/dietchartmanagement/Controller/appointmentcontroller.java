package com.example.dietchartmanagement.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dietchartmanagement.Beans.appointment;
import com.example.dietchartmanagement.Beans.slot;
import com.example.dietchartmanagement.Services.AppointmentService.appointmentservice;
import com.example.dietchartmanagement.Services.DoctorService.doctorservice;
import com.example.dietchartmanagement.Services.SlotService.slotservice;

@Controller
public class appointmentcontroller {
    @Autowired
    appointmentservice as;
    @Autowired
    slotservice ss;
    @Autowired
    doctorservice ds;

    @PostMapping("/appointsave")
    public String appointsave(@ModelAttribute("appointment") appointment appointment){

        as.save(appointment);
        return "redirect:/showappoint";
    }
    @RequestMapping("/showappoint")
    public String showappoint(Model model){
        model.addAttribute("showappoint", as.getAllEmployee()); // Add the "showappoint" attribute
        return "doctorexpertise";

    }
    @RequestMapping("/deleteappoint/{id}")
    public String deleteappoint(@PathVariable(value = "id")int id){
        as.deletebyId(id);

        return "redirect:/doctorexpertise";
    }

    @RequestMapping("/slotsave")
    public String slotsave(@ModelAttribute("slot") slot slot){

        ss.save(slot);
        return "redirect:/showappoint";
    }
   
    
}
