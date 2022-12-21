package com.example.Booking.controller;

import com.example.Booking.model.PropertyReview;
import com.example.Booking.service.PropertyReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propertyreview")
public class PropertyReviewController {

    private final PropertyReviewService propertyReviewService;


    @Autowired
    public PropertyReviewController(PropertyReviewService propertyReviewService) {
        this.propertyReviewService = propertyReviewService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PropertyReview>> getAllPropertyReviews(){
        List<PropertyReview> propertyReviewList = propertyReviewService.findAllPropertyReview();
        return new ResponseEntity<>(propertyReviewList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<PropertyReview> addPropertyReview(@RequestBody PropertyReview review) {
        PropertyReview newPropertyReview = propertyReviewService.addPropertyReview(review);
        return new ResponseEntity<>(newPropertyReview, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<PropertyReview> updatePropertyReview(@RequestBody PropertyReview review){
        PropertyReview updatePropertyReview = propertyReviewService.updatePropertyReview(review);
        return new ResponseEntity<>(updatePropertyReview, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProperty(@PathVariable("id") Long id) {
        propertyReviewService.deletePropertyReview(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PropertyReview> getPropertyById(@PathVariable("id") Long id) {
        PropertyReview newPropertyReview = propertyReviewService.findPropertyReviewById(id);
        return new ResponseEntity<>(newPropertyReview, HttpStatus.OK);
    }
}
