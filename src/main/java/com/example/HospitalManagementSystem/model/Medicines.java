package com.example.HospitalManagementSystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "medicines")
public class Medicines {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;
    private String manufacturer;
}
