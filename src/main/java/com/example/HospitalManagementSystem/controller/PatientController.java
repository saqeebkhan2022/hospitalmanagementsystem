package com.example.HospitalManagementSystem.controller;

import com.example.HospitalManagementSystem.model.Patient;
import com.example.HospitalManagementSystem.repository.PatientRepository;
import com.example.HospitalManagementSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    PatientRepository patientRepository;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String patientList(Model model){
        model.addAttribute("patientList",patientService.allPatients());
        return "index";
    }

    @RequestMapping(value = "/addPatient",method = RequestMethod.GET)
    public String showPatientRegisterForm(){
        return "addPatient";
    }

    @RequestMapping(value = "/savePatient",method = RequestMethod.POST)
    public String addPatient(@ModelAttribute Patient patient){

        this.patientService.addPatient(patient);
        return "redirect:/";
    }




    @GetMapping("/deletePatient/{id}")
    public String deletePatient(@PathVariable(value = "id") long id) {
        this.patientService.deleteById(id);
        return "redirect:/";
    }
}
