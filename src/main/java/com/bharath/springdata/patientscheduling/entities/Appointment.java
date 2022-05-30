package com.bharath.springdata.patientscheduling.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.print.Doc;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter @Setter @ToString
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "appointment_time")
    private LocalDateTime appointmentTime;
    private boolean started;
    private boolean ended;
    private String reason;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;
}
