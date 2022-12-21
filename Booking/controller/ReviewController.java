package com.example.Booking.controller;

import com.example.Booking.model.Review;
import com.example.Booking.repository.PropertyRepository;
import com.example.Booking.repository.ReviewRepository;
import com.example.Booking.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;
    private final PropertyRepository propertyRepository;
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewController(ReviewService reviewService,
                            PropertyRepository propertyRepository,
                            ReviewRepository reviewRepository){
        this.reviewService = reviewService;
        this.propertyRepository = propertyRepository;
        this.reviewRepository = reviewRepository;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Review>> getAllReviews() {
        List<Review> reviewList = reviewService.findAllReviews();
        return new ResponseEntity<>(reviewList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Review> addReview(@RequestBody Review review){
        Review newReview = reviewService.addReview(review);
        return new ResponseEntity<>(newReview, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Review> updateReview(@RequestBody Review review){
        Review updateReview = reviewService.updateReview(review);
        return new ResponseEntity<>(updateReview, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReview(@PathVariable("id") Long id) {
        reviewService.deleteReview(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Review> getReview(@PathVariable("id") Long id) {
        Review newReview = reviewService.findReviewById(id);
        return new ResponseEntity<>(newReview, HttpStatus.OK);
    }

}
