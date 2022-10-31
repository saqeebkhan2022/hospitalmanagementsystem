package com.example.HospitalManagementSystem.repository;

import com.example.HospitalManagementSystem.model.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AmbulanceRepository extends JpaRepository<Ambulance,Long> {

    @Query(value = "SELECT COUNT(*) FROM Ambulance")
    Long countAmbulance();
}
