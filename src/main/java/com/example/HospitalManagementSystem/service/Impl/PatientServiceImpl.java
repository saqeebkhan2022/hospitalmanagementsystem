package com.example.HospitalManagementSystem.service.Impl;

import com.example.HospitalManagementSystem.model.Patient;
import com.example.HospitalManagementSystem.repository.PatientRepository;
import com.example.HospitalManagementSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {



    @Autowired
    private PatientRepository patientRepository;


    @Override
    public List<Patient> allPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient addPatient(Patient patient) {

        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient, Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }


}
