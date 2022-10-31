package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.model.Ambulance;

import java.util.List;

public interface AmbulanceService {
    List<Ambulance> findAllAmbulance();
    Ambulance addAmbulance(Ambulance ambulance);
    void deleteAmbulanceById(Long id);
}
