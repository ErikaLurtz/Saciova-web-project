package BookingApp2.com.example.demo.controller;


import BookingApp2.com.example.demo.entities.tables.pojos.Review;
import BookingApp2.com.example.demo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("add")
    public int addReview(@RequestBody Review review) {
        return reviewService.add(review);
    }
}

//de dezvoltat mai departe
