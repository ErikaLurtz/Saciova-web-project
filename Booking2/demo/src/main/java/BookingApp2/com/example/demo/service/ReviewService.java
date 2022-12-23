package BookingApp2.com.example.demo.service;
import BookingApp2.com.example.demo.entities.Tables;
import BookingApp2.com.example.demo.entities.tables.pojos.Review;
import BookingApp2.com.example.demo.repository.CrudOperations;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements CrudOperations<Review> {

    @Autowired
    DSLContext context;

    @Override
    public int add(Review review) {
        return context.insertInto(Tables.REVIEW,
                Tables.REVIEW.COUNTRY,
                Tables.REVIEW.DESCRIPTION,
                Tables.REVIEW.ICON,
                        Tables.REVIEW.USERNAME)
                .values(
                review.getCountry(),
                review.getDescription(),
                review.getIcon(),
                        review.getUsername()).returning().execute();
    }

    @Override
    public List<Review> findAll() {
        return context.select().from(Tables.REVIEW).fetchInto(Review.class);
    }

    @Override
    public Review findById(int id) {
        return context.select().from(Tables.REVIEW).where(Tables.REVIEW.REVIEWID.eq(id)).fetchInto(Review.class).get(0);
    }

    @Override
    public int update(Review review) {
        return context.update(Tables.REVIEW)
                .set(Tables.REVIEW.USERNAME, review.getUsername())
                .set(Tables.REVIEW.COUNTRY, review.getCountry())
                .set(Tables.REVIEW.DESCRIPTION, review.getDescription())
                .set(Tables.REVIEW.ICON, review.getIcon())
                .where(Tables.REVIEW.REVIEWID.eq(review.getReviewid())).execute();
    }

    @Override
    public int deleteById(int id) {
        return context.delete(Tables.REVIEW).where(Tables.REVIEW.REVIEWID.eq(id)).execute();
    }

}
