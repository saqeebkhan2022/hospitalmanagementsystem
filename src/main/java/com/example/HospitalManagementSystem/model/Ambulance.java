package com.example.HospitalManagementSystem.model;

import com.example.HospitalManagementSystem.utils.AmbulanceStatus;
import com.example.HospitalManagementSystem.utils.FuelType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ambulance")
public class Ambulance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String makerModel;
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;
    private String registrationNumber;
    private String color;
    @Enumerated(EnumType.STRING)
    private AmbulanceStatus status= AmbulanceStatus.DEACTIVE;
}
