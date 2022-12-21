package com.example.Booking.service;

import com.example.Booking.model.PropertyReview;
import com.example.Booking.repository.PropertyRepository;
import com.example.Booking.repository.PropertyReviewRepository;
import com.example.Booking.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PropertyReviewService {

    private final PropertyReviewRepository propertyReviewRepository;
    private final PropertyRepository propertyRepository;
    private final ReviewRepository reviewRepository;

    @Autowired
    public PropertyReviewService(PropertyReviewRepository propertyReviewRepository, PropertyRepository propertyRepository, ReviewRepository reviewRepository) {
        this.propertyReviewRepository = propertyReviewRepository;
        this.propertyRepository = propertyRepository;
        this.reviewRepository = reviewRepository;
    }


    public List<PropertyReview> findAllPropertyReview() {return propertyReviewRepository.findAll();}

    public PropertyReview addPropertyReview(PropertyReview propertyReview) {return propertyReviewRepository.save(propertyReview);}

    public PropertyReview updatePropertyReview(PropertyReview propertyReview) {return propertyReviewRepository.save(propertyReview);}

    public void deletePropertyReview(Long id) {propertyReviewRepository.deletePropertyReviewById(id);}

    public PropertyReview findPropertyReviewById(Long id) {return propertyReviewRepository.findPropertyReviewById(id);}
}
