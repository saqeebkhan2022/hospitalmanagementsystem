package com.example.HospitalManagementSystem.repository;

import com.example.HospitalManagementSystem.model.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicines,Long> {
}
