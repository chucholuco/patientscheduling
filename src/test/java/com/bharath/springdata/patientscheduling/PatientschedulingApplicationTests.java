package com.bharath.springdata.patientscheduling;

import com.bharath.springdata.patientscheduling.entities.Appointment;
import com.bharath.springdata.patientscheduling.entities.Doctor;
import com.bharath.springdata.patientscheduling.entities.Insurance;
import com.bharath.springdata.patientscheduling.entities.Patient;
import com.bharath.springdata.patientscheduling.repository.AppointmentRepository;
import com.bharath.springdata.patientscheduling.repository.DoctorRepository;
import com.bharath.springdata.patientscheduling.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@SpringBootTest
class PatientschedulingApplicationTests {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	AppointmentRepository appointmentRepository;

	@Test
	public void testCreateDoctor() {
		Doctor doctor = new Doctor();
		doctor.setFirstName("Jesus");
		doctor.setLastName("Tapia");
		doctor.setSpeciality("General");
		doctorRepository.save(doctor);
	}

	@Test
	public void testCreatePatient() {
		Patient patient = new Patient();
		patient.setFirstName("Azalia");
		patient.setLastName("Santiago");
		patient.setPhone("556875463");
		Insurance insurance = new Insurance();
		insurance.setProviderName("Blue Cross Blue Shield");
		insurance.setCopay(20d);
		patient.setInsurance(insurance);

		Doctor doctor = doctorRepository.findById(1L).get();
		patient.setDoctors(Set.of(doctor));

		patientRepository.save(patient);
	}

	@Test
	public void testCreateAppointment() {
		Appointment appointment = new Appointment();
		LocalDateTime appointmentTime = LocalDateTime.of(2022, 6, 15, 10, 30);
		appointment.setAppointmentTime(appointmentTime);
		appointment.setReason("I have a problem");
		appointment.setStarted(true);
		appointment.setPatient(patientRepository.findById(1L).get());
		appointment.setDoctor(doctorRepository.findById(1L).get());

		appointmentRepository.save(appointment);
	}

}
