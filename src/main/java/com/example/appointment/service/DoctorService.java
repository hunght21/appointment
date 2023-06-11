package com.example.appointment.service;


import com.example.appointment.model.Doctor;
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
public interface DoctorService {

    Optional<Doctor> findById(Long aLong);

    Page<Doctor> findAll(Pageable pageable);

    Page<Doctor> findByNameContaining(String name, Pageable pageable);

    Doctor findByDoctorId(Long id);

    List<Doctor> getDoctorTime(String period, Long specialistId);
}
