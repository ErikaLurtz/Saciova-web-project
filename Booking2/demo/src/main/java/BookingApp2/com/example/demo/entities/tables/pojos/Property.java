/*
 * This file is generated by jOOQ.
 */
package BookingApp2.com.example.demo.entities.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Property implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer propertyid;
    private Boolean airporttransfer;
    private Boolean availability;
    private String  balcony;
    private Boolean bar;
    private String  bathroom;
    private String  bedroom;
    private Boolean childfriendly;
    private String  city;
    private String  country;
    private String  county;
    private String  description;
    private Double  dimension;
    private Integer guestnumber;
    private String  kitchen;
    private String  livingroom;
    private String  name;
    private Boolean parking;
    private Boolean petfriendly;
    private String  picture;
    private Double  price;
    private Integer rating;
    private Boolean sauna;
    private Boolean smoking;
    private Boolean spa;
    private String  terrace;
    private String  type;
    private Boolean wifi;

    public Property() {}

    public Property(Property value) {
        this.propertyid = value.propertyid;
        this.airporttransfer = value.airporttransfer;
        this.availability = value.availability;
        this.balcony = value.balcony;
        this.bar = value.bar;
        this.bathroom = value.bathroom;
        this.bedroom = value.bedroom;
        this.childfriendly = value.childfriendly;
        this.city = value.city;
        this.country = value.country;
        this.county = value.county;
        this.description = value.description;
        this.dimension = value.dimension;
        this.guestnumber = value.guestnumber;
        this.kitchen = value.kitchen;
        this.livingroom = value.livingroom;
        this.name = value.name;
        this.parking = value.parking;
        this.petfriendly = value.petfriendly;
        this.picture = value.picture;
        this.price = value.price;
        this.rating = value.rating;
        this.sauna = value.sauna;
        this.smoking = value.smoking;
        this.spa = value.spa;
        this.terrace = value.terrace;
        this.type = value.type;
        this.wifi = value.wifi;
    }

    public Property(
        Integer propertyid,
        Boolean airporttransfer,
        Boolean availability,
        String  balcony,
        Boolean bar,
        String  bathroom,
        String  bedroom,
        Boolean childfriendly,
        String  city,
        String  country,
        String  county,
        String  description,
        Double  dimension,
        Integer guestnumber,
        String  kitchen,
        String  livingroom,
        String  name,
        Boolean parking,
        Boolean petfriendly,
        String  picture,
        Double  price,
        Integer rating,
        Boolean sauna,
        Boolean smoking,
        Boolean spa,
        String  terrace,
        String  type,
        Boolean wifi
    ) {
        this.propertyid = propertyid;
        this.airporttransfer = airporttransfer;
        this.availability = availability;
        this.balcony = balcony;
        this.bar = bar;
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.childfriendly = childfriendly;
        this.city = city;
        this.country = country;
        this.county = county;
        this.description = description;
        this.dimension = dimension;
        this.guestnumber = guestnumber;
        this.kitchen = kitchen;
        this.livingroom = livingroom;
        this.name = name;
        this.parking = parking;
        this.petfriendly = petfriendly;
        this.picture = picture;
        this.price = price;
        this.rating = rating;
        this.sauna = sauna;
        this.smoking = smoking;
        this.spa = spa;
        this.terrace = terrace;
        this.type = type;
        this.wifi = wifi;
    }

    /**
     * Getter for <code>booking_app.property.PropertyId</code>.
     */
    public Integer getPropertyid() {
        return this.propertyid;
    }

    /**
     * Setter for <code>booking_app.property.PropertyId</code>.
     */
    public Property setPropertyid(Integer propertyid) {
        this.propertyid = propertyid;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.AirportTransfer</code>.
     */
    public Boolean getAirporttransfer() {
        return this.airporttransfer;
    }

    /**
     * Setter for <code>booking_app.property.AirportTransfer</code>.
     */
    public Property setAirporttransfer(Boolean airporttransfer) {
        this.airporttransfer = airporttransfer;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Availability</code>.
     */
    public Boolean getAvailability() {
        return this.availability;
    }

    /**
     * Setter for <code>booking_app.property.Availability</code>.
     */
    public Property setAvailability(Boolean availability) {
        this.availability = availability;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Balcony</code>.
     */
    public String getBalcony() {
        return this.balcony;
    }

    /**
     * Setter for <code>booking_app.property.Balcony</code>.
     */
    public Property setBalcony(String balcony) {
        this.balcony = balcony;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Bar</code>.
     */
    public Boolean getBar() {
        return this.bar;
    }

    /**
     * Setter for <code>booking_app.property.Bar</code>.
     */
    public Property setBar(Boolean bar) {
        this.bar = bar;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Bathroom</code>.
     */
    public String getBathroom() {
        return this.bathroom;
    }

    /**
     * Setter for <code>booking_app.property.Bathroom</code>.
     */
    public Property setBathroom(String bathroom) {
        this.bathroom = bathroom;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Bedroom</code>.
     */
    public String getBedroom() {
        return this.bedroom;
    }

    /**
     * Setter for <code>booking_app.property.Bedroom</code>.
     */
    public Property setBedroom(String bedroom) {
        this.bedroom = bedroom;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.ChildFriendly</code>.
     */
    public Boolean getChildfriendly() {
        return this.childfriendly;
    }

    /**
     * Setter for <code>booking_app.property.ChildFriendly</code>.
     */
    public Property setChildfriendly(Boolean childfriendly) {
        this.childfriendly = childfriendly;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.City</code>.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>booking_app.property.City</code>.
     */
    public Property setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Country</code>.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>booking_app.property.Country</code>.
     */
    public Property setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.County</code>.
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * Setter for <code>booking_app.property.County</code>.
     */
    public Property setCounty(String county) {
        this.county = county;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>booking_app.property.Description</code>.
     */
    public Property setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Dimension</code>.
     */
    public Double getDimension() {
        return this.dimension;
    }

    /**
     * Setter for <code>booking_app.property.Dimension</code>.
     */
    public Property setDimension(Double dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.GuestNumber</code>.
     */
    public Integer getGuestnumber() {
        return this.guestnumber;
    }

    /**
     * Setter for <code>booking_app.property.GuestNumber</code>.
     */
    public Property setGuestnumber(Integer guestnumber) {
        this.guestnumber = guestnumber;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Kitchen</code>.
     */
    public String getKitchen() {
        return this.kitchen;
    }

    /**
     * Setter for <code>booking_app.property.Kitchen</code>.
     */
    public Property setKitchen(String kitchen) {
        this.kitchen = kitchen;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.LivingRoom</code>.
     */
    public String getLivingroom() {
        return this.livingroom;
    }

    /**
     * Setter for <code>booking_app.property.LivingRoom</code>.
     */
    public Property setLivingroom(String livingroom) {
        this.livingroom = livingroom;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>booking_app.property.Name</code>.
     */
    public Property setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Parking</code>.
     */
    public Boolean getParking() {
        return this.parking;
    }

    /**
     * Setter for <code>booking_app.property.Parking</code>.
     */
    public Property setParking(Boolean parking) {
        this.parking = parking;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.PetFriendly</code>.
     */
    public Boolean getPetfriendly() {
        return this.petfriendly;
    }

    /**
     * Setter for <code>booking_app.property.PetFriendly</code>.
     */
    public Property setPetfriendly(Boolean petfriendly) {
        this.petfriendly = petfriendly;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Picture</code>.
     */
    public String getPicture() {
        return this.picture;
    }

    /**
     * Setter for <code>booking_app.property.Picture</code>.
     */
    public Property setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Price</code>.
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>booking_app.property.Price</code>.
     */
    public Property setPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Rating</code>.
     */
    public Integer getRating() {
        return this.rating;
    }

    /**
     * Setter for <code>booking_app.property.Rating</code>.
     */
    public Property setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Sauna</code>.
     */
    public Boolean getSauna() {
        return this.sauna;
    }

    /**
     * Setter for <code>booking_app.property.Sauna</code>.
     */
    public Property setSauna(Boolean sauna) {
        this.sauna = sauna;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Smoking</code>.
     */
    public Boolean getSmoking() {
        return this.smoking;
    }

    /**
     * Setter for <code>booking_app.property.Smoking</code>.
     */
    public Property setSmoking(Boolean smoking) {
        this.smoking = smoking;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Spa</code>.
     */
    public Boolean getSpa() {
        return this.spa;
    }

    /**
     * Setter for <code>booking_app.property.Spa</code>.
     */
    public Property setSpa(Boolean spa) {
        this.spa = spa;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Terrace</code>.
     */
    public String getTerrace() {
        return this.terrace;
    }

    /**
     * Setter for <code>booking_app.property.Terrace</code>.
     */
    public Property setTerrace(String terrace) {
        this.terrace = terrace;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Type</code>.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>booking_app.property.Type</code>.
     */
    public Property setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>booking_app.property.Wifi</code>.
     */
    public Boolean getWifi() {
        return this.wifi;
    }

    /**
     * Setter for <code>booking_app.property.Wifi</code>.
     */
    public Property setWifi(Boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Property other = (Property) obj;
        if (propertyid == null) {
            if (other.propertyid != null)
                return false;
        }
        else if (!propertyid.equals(other.propertyid))
            return false;
        if (airporttransfer == null) {
            if (other.airporttransfer != null)
                return false;
        }
        else if (!airporttransfer.equals(other.airporttransfer))
            return false;
        if (availability == null) {
            if (other.availability != null)
                return false;
        }
        else if (!availability.equals(other.availability))
            return false;
        if (balcony == null) {
            if (other.balcony != null)
                return false;
        }
        else if (!balcony.equals(other.balcony))
            return false;
        if (bar == null) {
            if (other.bar != null)
                return false;
        }
        else if (!bar.equals(other.bar))
            return false;
        if (bathroom == null) {
            if (other.bathroom != null)
                return false;
        }
        else if (!bathroom.equals(other.bathroom))
            return false;
        if (bedroom == null) {
            if (other.bedroom != null)
                return false;
        }
        else if (!bedroom.equals(other.bedroom))
            return false;
        if (childfriendly == null) {
            if (other.childfriendly != null)
                return false;
        }
        else if (!childfriendly.equals(other.childfriendly))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        }
        else if (!country.equals(other.country))
            return false;
        if (county == null) {
            if (other.county != null)
                return false;
        }
        else if (!county.equals(other.county))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (dimension == null) {
            if (other.dimension != null)
                return false;
        }
        else if (!dimension.equals(other.dimension))
            return false;
        if (guestnumber == null) {
            if (other.guestnumber != null)
                return false;
        }
        else if (!guestnumber.equals(other.guestnumber))
            return false;
        if (kitchen == null) {
            if (other.kitchen != null)
                return false;
        }
        else if (!kitchen.equals(other.kitchen))
            return false;
        if (livingroom == null) {
            if (other.livingroom != null)
                return false;
        }
        else if (!livingroom.equals(other.livingroom))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (parking == null) {
            if (other.parking != null)
                return false;
        }
        else if (!parking.equals(other.parking))
            return false;
        if (petfriendly == null) {
            if (other.petfriendly != null)
                return false;
        }
        else if (!petfriendly.equals(other.petfriendly))
            return false;
        if (picture == null) {
            if (other.picture != null)
                return false;
        }
        else if (!picture.equals(other.picture))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        }
        else if (!price.equals(other.price))
            return false;
        if (rating == null) {
            if (other.rating != null)
                return false;
        }
        else if (!rating.equals(other.rating))
            return false;
        if (sauna == null) {
            if (other.sauna != null)
                return false;
        }
        else if (!sauna.equals(other.sauna))
            return false;
        if (smoking == null) {
            if (other.smoking != null)
                return false;
        }
        else if (!smoking.equals(other.smoking))
            return false;
        if (spa == null) {
            if (other.spa != null)
                return false;
        }
        else if (!spa.equals(other.spa))
            return false;
        if (terrace == null) {
            if (other.terrace != null)
                return false;
        }
        else if (!terrace.equals(other.terrace))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (wifi == null) {
            if (other.wifi != null)
                return false;
        }
        else if (!wifi.equals(other.wifi))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.propertyid == null) ? 0 : this.propertyid.hashCode());
        result = prime * result + ((this.airporttransfer == null) ? 0 : this.airporttransfer.hashCode());
        result = prime * result + ((this.availability == null) ? 0 : this.availability.hashCode());
        result = prime * result + ((this.balcony == null) ? 0 : this.balcony.hashCode());
        result = prime * result + ((this.bar == null) ? 0 : this.bar.hashCode());
        result = prime * result + ((this.bathroom == null) ? 0 : this.bathroom.hashCode());
        result = prime * result + ((this.bedroom == null) ? 0 : this.bedroom.hashCode());
        result = prime * result + ((this.childfriendly == null) ? 0 : this.childfriendly.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
        result = prime * result + ((this.county == null) ? 0 : this.county.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.dimension == null) ? 0 : this.dimension.hashCode());
        result = prime * result + ((this.guestnumber == null) ? 0 : this.guestnumber.hashCode());
        result = prime * result + ((this.kitchen == null) ? 0 : this.kitchen.hashCode());
        result = prime * result + ((this.livingroom == null) ? 0 : this.livingroom.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.parking == null) ? 0 : this.parking.hashCode());
        result = prime * result + ((this.petfriendly == null) ? 0 : this.petfriendly.hashCode());
        result = prime * result + ((this.picture == null) ? 0 : this.picture.hashCode());
        result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
        result = prime * result + ((this.rating == null) ? 0 : this.rating.hashCode());
        result = prime * result + ((this.sauna == null) ? 0 : this.sauna.hashCode());
        result = prime * result + ((this.smoking == null) ? 0 : this.smoking.hashCode());
        result = prime * result + ((this.spa == null) ? 0 : this.spa.hashCode());
        result = prime * result + ((this.terrace == null) ? 0 : this.terrace.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.wifi == null) ? 0 : this.wifi.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Property (");

        sb.append(propertyid);
        sb.append(", ").append(airporttransfer);
        sb.append(", ").append(availability);
        sb.append(", ").append(balcony);
        sb.append(", ").append(bar);
        sb.append(", ").append(bathroom);
        sb.append(", ").append(bedroom);
        sb.append(", ").append(childfriendly);
        sb.append(", ").append(city);
        sb.append(", ").append(country);
        sb.append(", ").append(county);
        sb.append(", ").append(description);
        sb.append(", ").append(dimension);
        sb.append(", ").append(guestnumber);
        sb.append(", ").append(kitchen);
        sb.append(", ").append(livingroom);
        sb.append(", ").append(name);
        sb.append(", ").append(parking);
        sb.append(", ").append(petfriendly);
        sb.append(", ").append(picture);
        sb.append(", ").append(price);
        sb.append(", ").append(rating);
        sb.append(", ").append(sauna);
        sb.append(", ").append(smoking);
        sb.append(", ").append(spa);
        sb.append(", ").append(terrace);
        sb.append(", ").append(type);
        sb.append(", ").append(wifi);

        sb.append(")");
        return sb.toString();
    }
}
