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
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String phone;

    @Embedded
    private Insurance insurance;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "patients_doctors",
            joinColumns = @JoinColumn(name = "patient_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id", referencedColumnName = "id"))
    private Set<Doctor> doctors;

    @OneToMany
    private Set<Appointment> appointments;
}
