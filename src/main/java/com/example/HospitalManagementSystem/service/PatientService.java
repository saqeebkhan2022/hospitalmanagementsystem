package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.model.Patient;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface PatientService {

    List<Patient> allPatients();
    Patient addPatient(Patient patient);
    Patient updatePatient(Patient patient,Long id);
    void deleteById(Long id);



}
