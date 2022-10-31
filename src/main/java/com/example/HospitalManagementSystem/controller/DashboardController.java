package com.example.HospitalManagementSystem.controller;

import com.example.HospitalManagementSystem.repository.AmbulanceRepository;
import com.example.HospitalManagementSystem.repository.DoctorRepository;
import com.example.HospitalManagementSystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    AmbulanceRepository ambulanceRepository;
    @Autowired
    DoctorRepository doctorRepository;

    @RequestMapping(value = "/dashboard",method = RequestMethod.GET)
    public String Dashboard(Model model){
        model.addAttribute("countPatients",patientRepository.countPatients());
        model.addAttribute("countAmbulance",ambulanceRepository.countAmbulance());
        //add all counts needed
        return "dashboard";
    }
}
