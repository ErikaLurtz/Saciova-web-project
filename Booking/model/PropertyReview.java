package com.example.Booking.model;

import jakarta.persistence.*;

@Entity
@Table(name="property_review")
public class PropertyReview {

    @Id
    private Long id;

    @ManyToOne()
    @JoinColumn(name="property_id", referencedColumnName = "id")
    private Property property;

    @ManyToOne()
    @JoinColumn(name="review_id", referencedColumnName = "id")
    private Review review;


}
