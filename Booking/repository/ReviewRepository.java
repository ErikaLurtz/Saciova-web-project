package com.example.Booking.repository;

import com.example.Booking.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    void deleteReviewById(Long id);
    Review findReviewById(Long id);

}
