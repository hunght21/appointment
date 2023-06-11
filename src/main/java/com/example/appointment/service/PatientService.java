package com.example.appointment.service;

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
public interface PatientService {


    <S extends Patient> S save(S entity);

    Optional<Patient> findById(Long aLong);

    boolean existsPatientByPhone(Long phone);

    boolean existsPatientByIdCard(String idCard);

    Patient findByPatientId(Long id);

    Patient findByEmailAndPassword(String email, String password);

    Patient findByEmail(String email);
}
