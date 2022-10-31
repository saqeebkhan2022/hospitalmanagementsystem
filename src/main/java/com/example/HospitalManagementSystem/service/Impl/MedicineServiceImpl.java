package com.example.HospitalManagementSystem.service.Impl;

import com.example.HospitalManagementSystem.model.Medicines;
import com.example.HospitalManagementSystem.repository.MedicineRepository;
import com.example.HospitalManagementSystem.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;


    @Override
    public List<Medicines> allMedicines() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicines addMedicine(Medicines medicines) {
        return medicineRepository.save(medicines);
    }

    @Override
    public Medicines updateMedicine(Medicines medicines, Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        medicineRepository.deleteById(id);
    }
}
