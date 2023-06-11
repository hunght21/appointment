package com.example.appointment.service;


import com.example.appointment.model.Appointment;
import com.example.appointment.model.Doctor;
import com.example.appointment.model.Patient;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public interface AppointmentService {
    List<Appointment> findByPatient(Patient patient);

    List<Appointment> findByDoctor(Doctor doctor);

    <S extends Appointment> S save(S entity);

    Optional<Appointment> findById(Long aLong);

    List<Appointment> findByPatientId(Long patientId);
}
