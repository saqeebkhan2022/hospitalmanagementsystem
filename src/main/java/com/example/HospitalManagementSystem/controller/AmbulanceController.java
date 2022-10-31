package com.example.HospitalManagementSystem.controller;

import com.example.HospitalManagementSystem.model.Ambulance;
import com.example.HospitalManagementSystem.service.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AmbulanceController {
    @Autowired
    private AmbulanceService ambulanceService;

    @RequestMapping(path = "/listOfAmbulance", method = RequestMethod.GET)
    public String AmbulanceList(Model model){
        model.addAttribute("ambulanceList",ambulanceService.findAllAmbulance());
        return "ambulance";
    }


    @RequestMapping(value = "/addAmbulance",method = RequestMethod.GET)
    public String showAmbulanceRegisterForm(){
        return "addAmbulance";
    }

    @RequestMapping(value = "/saveAmbulance",method = RequestMethod.POST)
    public String addAmbulance(@ModelAttribute Ambulance ambulance){
        this.ambulanceService.addAmbulance(ambulance);
        return "redirect:/";
    }

    @GetMapping("/deleteAmbulance/{id}")
    public String deleteAmbulance(@PathVariable(value = "id") long id) {
        ambulanceService.deleteAmbulanceById(id);
        return "redirect:ambulance";
    }

}
