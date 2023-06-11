package com.example.appointment.service;

import com.example.appointment.model.Doctor;
import com.example.appointment.model.Specialist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ServiceService {

    Page<com.example.appointment.model.Service> findAll(Pageable pageable);

//    Page<com.example.appointment.model.Service> findByServiceListNameContaining(String specialistName, Pageable pageable);

    Optional<com.example.appointment.model.Service> findByDoctorId(Long serviceId);
}
