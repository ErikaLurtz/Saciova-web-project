package BookingApp2.com.example.demo.service;

import BookingApp2.com.example.demo.entities.Tables;
import BookingApp2.com.example.demo.entities.tables.pojos.PropertyReviews;
import BookingApp2.com.example.demo.repository.CrudOperations;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PropertyReviewService implements CrudOperations<PropertyReviews> {

    @Autowired
    DSLContext context;

    @Override
    public int add(PropertyReviews propertyReviews) {
        return context.insertInto(Tables.PROPERTY_REVIEWS, Tables.PROPERTY_REVIEWS.PROPERTYID, Tables.PROPERTY_REVIEWS.REVIEWID).values(
                propertyReviews.getPropertyid(),
                propertyReviews.getReviewid()).returning().execute();
    }

    @Override
    public PropertyReviews findById(int id) {
        return null;
    }

    @Override
    public List<PropertyReviews> findAll() {
        return null;
    }


    public List<PropertyReviews> findReviewsById(int id) {
        return context.select().from(Tables.PROPERTY_REVIEWS).where(Tables.PROPERTY_REVIEWS.PROPERTYID.eq(id)).fetchInto(PropertyReviews.class);
    }

    @Override
    public int deleteById(int id){
        return context.delete(Tables.PROPERTY_REVIEWS).where(Tables.REVIEW.REVIEWID.eq(id)).execute();
    }

    @Override
    public int update(PropertyReviews ob) {
        return 0;
    }


}

