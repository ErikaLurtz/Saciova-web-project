package BookingApp2.com.example.demo.service;
import BookingApp2.com.example.demo.entities.Tables;
import BookingApp2.com.example.demo.entities.tables.pojos.Property;
import BookingApp2.com.example.demo.entities.tables.pojos.Review;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    DSLContext context;

    public int saveReview(Review review) {
        return context.insertInto(Tables.PROPERTY).values(
                review.getUsername(),
                review.getCountry(),
                review.getDescription(),
                review.getIcon()).returning().execute();
    }

    public List<Review> getReviews() {
        return context.select().from(Tables.REVIEW).fetchInto(Review.class);
    }

    public int deleteReview(int id) {
        return context.delete(Tables.REVIEW).where(Tables.REVIEW.REVIEWID.eq(id)).execute();
    }

}
