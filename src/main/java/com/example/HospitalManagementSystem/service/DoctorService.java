package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.model.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> findAllDoctors();
    Doctor addDoctor(Doctor doctor);
    Doctor updateDoctor(Long id);
    void deleteDoctor(Long id);
}
