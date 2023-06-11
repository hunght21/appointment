package com.example.appointment.repository;

import com.example.appointment.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
//    Page<Service> findByServiceListNameContaining(String serviceListName, Pageable pageable);
}
