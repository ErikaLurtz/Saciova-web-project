package com.example.Booking.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int guestNumber;
    private int rating;
    private double dimension;
    private double price;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Review> review;

    private String name;
    private String country;
    private String county;
    private String city;
    private String type; //ap/studio/house
    private String kitchen;
    private String bedroom;
    private String bathroom;
    private String living_room;
    private String balcony;
    private String terrace;
    private String picture;
    private String description;

    private boolean wifi;
    private boolean parking;
    private boolean child_friendly;
    private boolean pet_friendly;
    private boolean sauna;
    private boolean spa;
    private boolean smoking;
    private boolean bar;
    private boolean airport_transfer;
    private boolean availability;


    public Property() {
    }

    public Property(Long id, int guestNumber, int rating, double dimension, double price, List<Review> review, String name, String country, String county, String city, String type, String kitchen, String bedroom, String bathroom, String living_room, String balcony, String terrace, String picture, String description, boolean wifi, boolean parking, boolean child_friendly, boolean pet_friendly, boolean sauna, boolean spa, boolean smoking, boolean bar, boolean airport_transfer, boolean availability) {
        this.id =id;
        this.guestNumber = guestNumber;
        this.rating = rating;
        this.dimension = dimension;
        this.price = price;
        this.review = review;
        this.name = name;
        this.country = country;
        this.county = county;
        this.city = city;
        this.type = type;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.living_room = living_room;
        this.balcony = balcony;
        this.terrace = terrace;
        this.picture = picture;
        this.description = description;
        this.wifi = wifi;
        this.parking = parking;
        this.child_friendly = child_friendly;
        this.pet_friendly = pet_friendly;
        this.sauna = sauna;
        this.spa = spa;
        this.smoking = smoking;
        this.bar = bar;
        this.airport_transfer = airport_transfer;
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id =id;
    }

    public int getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(int guestNumber) {
        this.guestNumber = guestNumber;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getLiving_room() {
        return living_room;
    }

    public void setLiving_room(String living_room) {
        this.living_room = living_room;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public String getTerrace() {
        return terrace;
    }

    public void setTerrace(String terrace) {
        this.terrace = terrace;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isChild_friendly() {
        return child_friendly;
    }

    public void setChild_friendly(boolean child_friendly) {
        this.child_friendly = child_friendly;
    }

    public boolean isPet_friendly() {
        return pet_friendly;
    }

    public void setPet_friendly(boolean pet_friendly) {
        this.pet_friendly = pet_friendly;
    }

    public boolean isSauna() {
        return sauna;
    }

    public void setSauna(boolean sauna) {
        this.sauna = sauna;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean isAirport_transfer() {
        return airport_transfer;
    }

    public void setAirport_transfer(boolean airport_transfer) {
        this.airport_transfer = airport_transfer;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", guestNumber=" + guestNumber +
                ", rating=" + rating +
                ", dimension=" + dimension +
                ", price=" + price +
                ", review=" + review +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", county='" + county + '\'' +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", bedroom='" + bedroom + '\'' +
                ", bathroom='" + bathroom + '\'' +
                ", living_room='" + living_room + '\'' +
                ", balcony='" + balcony + '\'' +
                ", terrace='" + terrace + '\'' +
                ", picture='" + picture + '\'' +
                ", description='" + description + '\'' +
                ", wifi=" + wifi +
                ", parking=" + parking +
                ", child_friendly=" + child_friendly +
                ", pet_friendly=" + pet_friendly +
                ", sauna=" + sauna +
                ", spa=" + spa +
                ", smoking=" + smoking +
                ", bar=" + bar +
                ", airport_transfer=" + airport_transfer +
                ", availability=" + availability +
                '}';
    }
}
