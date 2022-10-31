package com.example.HospitalManagementSystem.repository;

import com.example.HospitalManagementSystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

    @Query(value = "SELECT COUNT(*) FROM Patient")
    Long countPatients();
}
