package com.example.HospitalManagementSystem.controller;

import com.example.HospitalManagementSystem.model.Doctor;
import com.example.HospitalManagementSystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @RequestMapping("/")
    public String Home(){
    return "index";
    }

    @RequestMapping("/login")
    public String login() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication ==null || authentication instanceof AnonymousAuthenticationToken){
            return "login";
        }
        return "redirect:index";

    }


    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/addDoctor",method = RequestMethod.GET)
    public String showForm(){
        return "addDoctor";
    }

    @RequestMapping(value = "/saveDoctor",method = RequestMethod.POST)
    public String addDoctor(@ModelAttribute Doctor doctor){
        this.doctorService.addDoctor(doctor);
        return "redirect:/";
    }

    @RequestMapping(value = "/doctorList")
    public String doctorList(Model model){
        model.addAttribute("doctorList",doctorService.findAllDoctors());
        return "doctorList";
    }

    @GetMapping("/deleteDoctor/{id}")
    public String deleteDoctor(@PathVariable  Long id){
         this.doctorService.deleteDoctor(id);
         return "redirect:/doctorList";
    }


    @GetMapping("/updateDoctor/{id}")
    public String updateDoctor(@PathVariable Long id,Model model){
        Doctor doctor= doctorService.updateDoctor(id);
        model.addAttribute("doctor",doctor);
        return "updateDoctor";

    }



}
