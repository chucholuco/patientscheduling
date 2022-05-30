package com.bharath.springdata.patientscheduling.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String speciality;

    @ManyToMany(mappedBy = "doctors")
    private Set<Patient> patients;

    @OneToMany
    private Set<Appointment> appointments;
}
