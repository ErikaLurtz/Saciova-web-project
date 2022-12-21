package com.example.Booking.service;

import com.example.Booking.model.Property;
import com.example.Booking.model.Review;
import com.example.Booking.repository.PropertyRepository;
import com.example.Booking.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    public Review addReview(Review review){
        return reviewRepository.save(review);
    }

    public Review updateReview(Review review){
        return reviewRepository.save(review);
    }

    public void deleteReview(Long id){
        reviewRepository.deleteReviewById(id);
    }

    public List<Review> findAllReviews() {
        return reviewRepository.findAll();
    }

    public Review findReviewById(Long id){
        return reviewRepository.findReviewById(id);
    }





}
