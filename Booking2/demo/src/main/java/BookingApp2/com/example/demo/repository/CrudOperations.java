package BookingApp2.com.example.demo.repository;

import BookingApp2.com.example.demo.entities.tables.pojos.PropertyReviews;

import java.util.List;

public interface CrudOperations<T> {

    int add(T ob);

    T findById(int id);

    List<T> findAll();

    int deleteById(int id);

    int update(T ob);
}
