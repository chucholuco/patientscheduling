package com.bharath.springdata.patientscheduling.repository;

import com.bharath.springdata.patientscheduling.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository  extends JpaRepository<Appointment, Long> {
}
