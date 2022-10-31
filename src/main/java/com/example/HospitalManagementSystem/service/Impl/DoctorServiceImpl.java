package com.example.HospitalManagementSystem.service.Impl;

import com.example.HospitalManagementSystem.model.Doctor;
import com.example.HospitalManagementSystem.repository.DoctorRepository;
import com.example.HospitalManagementSystem.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public List<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor( Long id) {
        Optional<Doctor> optional = doctorRepository.findById(id);
        Doctor doctor= null;
        if (optional.isPresent()){
            doctor=optional.get();
        }else {
            throw  new RuntimeException("Doctor not found with this id ::"+id);
        }
        return doctor;
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}
