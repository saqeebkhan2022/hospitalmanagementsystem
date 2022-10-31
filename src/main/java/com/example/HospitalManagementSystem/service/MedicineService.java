package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.model.Medicines;

import java.util.List;

public interface MedicineService {
    List<Medicines> allMedicines();
    Medicines addMedicine(Medicines medicines);
    Medicines updateMedicine(Medicines medicines,Long id);
    void deleteById(Long id);
}
