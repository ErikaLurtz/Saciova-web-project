package com.example.Booking.repository;

import com.example.Booking.model.PropertyReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyReviewRepository extends JpaRepository<PropertyReview, Long> {

    void deletePropertyReviewById(Long id);
    PropertyReview findPropertyReviewById(Long id);

}
