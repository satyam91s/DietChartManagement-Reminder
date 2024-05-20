package com.example.dietchartmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dietchartmanagement.Beans.diet;
import com.example.dietchartmanagement.Services.DietService.dietservice;


@Controller
public class dietcontroller {
   @Autowired
   dietservice dis;

    @PostMapping("/dietsave")
    public String savediet(@ModelAttribute("diet") diet diet) {
        dis.save(diet);
        return "redirect:/dietdata";
    }
    @GetMapping("/dietdata")
    public String viewHomePage(Model model) {
        model.addAttribute("alldietdata", dis.getAllEmployee());
        return "dietdata";
    }
    @GetMapping("/dietdetailform")
    public String dietdataform(Model model) {
        model.addAttribute("diet", new diet());
        return "dietform";
    }
    @GetMapping("/deletebyId/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        dis.deleteViaId(id);
        return "redirect:/dietdata";
 
    }
    @GetMapping("/customform")
    public String customform() {
        
        return "customdata/customform";
 
    }
}
