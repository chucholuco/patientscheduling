package com.bharath.springdata.patientscheduling.repository;

import com.bharath.springdata.patientscheduling.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor, Long> {
}
