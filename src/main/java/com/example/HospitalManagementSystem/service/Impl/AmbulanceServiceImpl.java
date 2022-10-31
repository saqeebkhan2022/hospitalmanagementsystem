package com.example.HospitalManagementSystem.service.Impl;

import com.example.HospitalManagementSystem.model.Ambulance;
import com.example.HospitalManagementSystem.repository.AmbulanceRepository;
import com.example.HospitalManagementSystem.service.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmbulanceServiceImpl implements AmbulanceService {

    @Autowired
    private AmbulanceRepository ambulanceRepository;


    @Override
    public List<Ambulance> findAllAmbulance() {
        return ambulanceRepository.findAll();
    }

    @Override
    public Ambulance addAmbulance(Ambulance ambulance) {
        return ambulanceRepository.save(ambulance);
    }

    @Override
    public void deleteAmbulanceById(Long id) {
        ambulanceRepository.deleteById(id);
    }
}
