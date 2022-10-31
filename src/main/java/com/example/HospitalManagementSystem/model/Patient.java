package com.example.HospitalManagementSystem.model;

import com.example.HospitalManagementSystem.utils.Gender;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@ToString
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(unique = true,length = 10)
    private String mobileNo;
    private String email;
    private String state;
    private String city;
    private String district;
    private String pinCode;
    @Column(unique = true,length = 12)
    private String aadhaarNo;
    private String relation;





}
