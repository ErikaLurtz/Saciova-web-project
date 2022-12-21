package com.example.Booking.repository;

import com.example.Booking.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {

    void deletePropertyById(Long id);
    Property findPropertyById(Long id);
}
