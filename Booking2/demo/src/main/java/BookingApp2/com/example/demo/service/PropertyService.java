package BookingApp2.com.example.demo.service;

import BookingApp2.com.example.demo.entities.Tables;
import BookingApp2.com.example.demo.entities.tables.pojos.Property;
import BookingApp2.com.example.demo.repository.CrudOperations;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService implements CrudOperations<Property> {

    @Autowired
    DSLContext context;

    @Override
    public int add(Property property) {
        return context.insertInto(Tables.PROPERTY,
                Tables.PROPERTY.GUESTNUMBER,
                Tables.PROPERTY.RATING,
                Tables.PROPERTY.DIMENSION,
                Tables.PROPERTY.PRICE,
                Tables.PROPERTY.NAME,
                Tables.PROPERTY.COUNTRY,
                Tables.PROPERTY.COUNTY,
                Tables.PROPERTY.CITY,
                Tables.PROPERTY.TYPE,
                Tables.PROPERTY.BEDROOM,
                Tables.PROPERTY.BATHROOM,
                Tables.PROPERTY.LIVINGROOM,
                Tables.PROPERTY.BALCONY,
                Tables.PROPERTY.TERRACE,
                Tables.PROPERTY.PICTURE,
                Tables.PROPERTY.DESCRIPTION,
                Tables.PROPERTY.WIFI,
                Tables.PROPERTY.PARKING,
                Tables.PROPERTY.CHILDFRIENDLY,
                Tables.PROPERTY.PETFRIENDLY,
                Tables.PROPERTY.SAUNA,
                Tables.PROPERTY.SPA,
                Tables.PROPERTY.SMOKING,
                Tables.PROPERTY.BAR,
                Tables.PROPERTY.AIRPORTTRANSFER,
                Tables.PROPERTY.AVAILABILITY).values(
                property.getGuestnumber(),
                property.getRating(),
                property.getDimension(),
                property.getPrice(),
                property.getName(),
                property.getCountry(),
                property.getCounty(),
                property.getCity(),
                property.getType(),
                property.getBedroom(),
                property.getBathroom(),
                property.getLivingroom(),
                property.getBalcony(),
                property.getTerrace(),
                property.getPicture(),
                property.getDescription(),
                property.getWifi(),
                property.getParking(),
                property.getChildfriendly(),
                property.getPetfriendly(),
                property.getSauna(),
                property.getSpa(),
                property.getSmoking(),
                property.getBar(),
                property.getAirporttransfer(),
                property.getAvailability())
                .returning()
                .execute();
    }

    @Override
    public List<Property> findAll() {
        return context.select().from(Tables.PROPERTY).fetchInto(Property.class);
    }

    @Override
    public Property findById(int id) {
        return context.select().from(Tables.PROPERTY).where(Tables.PROPERTY.PROPERTYID.eq(id)).fetchInto(Property.class).get(0);
    }

    @Override
    public int deleteById(int id) {
        return context.delete(Tables.PROPERTY).where(Tables.PROPERTY.PROPERTYID.eq(id)).execute();
    }

    @Override
    public int update(Property property) {
        return context.update(Tables.PROPERTY)
                .set(Tables.PROPERTY.GUESTNUMBER, property.getGuestnumber())
                .set(Tables.PROPERTY.RATING, property.getRating())
                .set(Tables.PROPERTY.DIMENSION, property.getDimension())
                .set(Tables.PROPERTY.PRICE, property.getPrice())
                .set(Tables.PROPERTY.NAME, property.getName())
                .set(Tables.PROPERTY.COUNTRY, property.getCountry())
                .set(Tables.PROPERTY.COUNTY, property.getCounty())
                .set(Tables.PROPERTY.CITY, property.getCity())
                .set(Tables.PROPERTY.TYPE, property.getType())
                .set(Tables.PROPERTY.BEDROOM, property.getBedroom())
                .set(Tables.PROPERTY.BATHROOM, property.getBathroom())
                .set(Tables.PROPERTY.LIVINGROOM, property.getLivingroom())
                .set(Tables.PROPERTY.BALCONY, property.getBalcony())
                .set(Tables.PROPERTY.TERRACE, property.getTerrace())
                .set(Tables.PROPERTY.PICTURE, property.getPicture())
                .set(Tables.PROPERTY.DESCRIPTION, property.getDescription())
                .set(Tables.PROPERTY.WIFI, property.getWifi())
                .set(Tables.PROPERTY.PARKING, property.getParking())
                .set(Tables.PROPERTY.CHILDFRIENDLY, property.getChildfriendly())
                .set(Tables.PROPERTY.PETFRIENDLY, property.getPetfriendly())
                .set(Tables.PROPERTY.SAUNA, property.getSauna())
                .set(Tables.PROPERTY.SPA, property.getSpa())
                .set(Tables.PROPERTY.SMOKING, property.getSmoking())
                .set(Tables.PROPERTY.BAR, property.getBar())
                .set(Tables.PROPERTY.AIRPORTTRANSFER, property.getAirporttransfer())
                .set(Tables.PROPERTY.AVAILABILITY, property.getAvailability())
                .where(Tables.PROPERTY.PROPERTYID.eq(property.getPropertyid())).execute();
    }

}
