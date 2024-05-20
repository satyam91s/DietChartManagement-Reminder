package com.example.dietchartmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dietchartmanagement.Beans.diet;
import com.example.dietchartmanagement.CustomData.aidsdietdata;
import com.example.dietchartmanagement.CustomData.aidsdietservice;
import com.example.dietchartmanagement.CustomData.bpdietdata;
import com.example.dietchartmanagement.CustomData.diabetesdata;
import com.example.dietchartmanagement.CustomData.bpdietservice;
import com.example.dietchartmanagement.CustomData.diabetesservice;

@Controller
public class customdietcon {

    @Autowired
    bpdietservice bss;
    @Autowired
    aidsdietservice ass;
    @Autowired
    diabetesservice dss;

    @PostMapping("/datasave")
    public String datasave1(@ModelAttribute("bpdiet") bpdietdata bpdiet) {
        bss.save(bpdiet);
        return "redirect:/dataform";
    }
    @PostMapping("/datasaveaids")
    public String datasave2(@ModelAttribute("aidsdiet") aidsdietdata aidsdiet) {
        ass.save(aidsdiet);
        return "redirect:/dataform";
    }
    @PostMapping("/datasavedi")
    public String datasave3(@ModelAttribute("diabetesdiet")  diabetesdata diabetesdiet) {
        dss.save(diabetesdiet);
        return "redirect:/dataform";
    }

    @GetMapping("/bpdiet")
    public String bpdiet(Model model) {
        model.addAttribute("bpdiet", bss.getAllEmployee());
        return "customdata/bpdiet";
    }
    @GetMapping("/aidsdiet")
    public String aidsdiet(Model model) {
        model.addAttribute("aidsdiet", ass.getAllEmployee());
        return "customdata/aidsdiet";
    }
    @GetMapping("/diabetesdiet")
    public String diabetesdata(Model model) {
        model.addAttribute("diabetesdiet", dss.getAllEmployee());
        return "customdata/diabetes";
    }


    @GetMapping("/dataform")
    public String formdata(Model model){
        model.addAttribute("bpdiet", new bpdietdata());

        return "customdata/dataform";
    }
    
}
