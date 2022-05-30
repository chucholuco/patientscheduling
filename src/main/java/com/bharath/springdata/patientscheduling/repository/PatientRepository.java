package com.bharath.springdata.patientscheduling.repository;

import com.bharath.springdata.patientscheduling.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
