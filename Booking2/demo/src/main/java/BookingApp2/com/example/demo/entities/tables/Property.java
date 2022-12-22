/*
 * This file is generated by jOOQ.
 */
package BookingApp2.com.example.demo.entities.tables;


import BookingApp2.com.example.demo.entities.BookingApp;
import BookingApp2.com.example.demo.entities.Keys;
import BookingApp2.com.example.demo.entities.tables.records.PropertyRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Property extends TableImpl<PropertyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>booking_app.property</code>
     */
    public static final Property PROPERTY = new Property();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PropertyRecord> getRecordType() {
        return PropertyRecord.class;
    }

    /**
     * The column <code>booking_app.property.PropertyId</code>.
     */
    public final TableField<PropertyRecord, Integer> PROPERTYID = createField(DSL.name("PropertyId"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>booking_app.property.AirportTransfer</code>.
     */
    public final TableField<PropertyRecord, Boolean> AIRPORTTRANSFER = createField(DSL.name("AirportTransfer"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Availability</code>.
     */
    public final TableField<PropertyRecord, Boolean> AVAILABILITY = createField(DSL.name("Availability"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Balcony</code>.
     */
    public final TableField<PropertyRecord, String> BALCONY = createField(DSL.name("Balcony"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Bar</code>.
     */
    public final TableField<PropertyRecord, Boolean> BAR = createField(DSL.name("Bar"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Bathroom</code>.
     */
    public final TableField<PropertyRecord, String> BATHROOM = createField(DSL.name("Bathroom"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Bedroom</code>.
     */
    public final TableField<PropertyRecord, String> BEDROOM = createField(DSL.name("Bedroom"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.ChildFriendly</code>.
     */
    public final TableField<PropertyRecord, Boolean> CHILDFRIENDLY = createField(DSL.name("ChildFriendly"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.City</code>.
     */
    public final TableField<PropertyRecord, String> CITY = createField(DSL.name("City"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Country</code>.
     */
    public final TableField<PropertyRecord, String> COUNTRY = createField(DSL.name("Country"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.County</code>.
     */
    public final TableField<PropertyRecord, String> COUNTY = createField(DSL.name("County"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Description</code>.
     */
    public final TableField<PropertyRecord, String> DESCRIPTION = createField(DSL.name("Description"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Dimension</code>.
     */
    public final TableField<PropertyRecord, Double> DIMENSION = createField(DSL.name("Dimension"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.GuestNumber</code>.
     */
    public final TableField<PropertyRecord, Integer> GUESTNUMBER = createField(DSL.name("GuestNumber"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Kitchen</code>.
     */
    public final TableField<PropertyRecord, String> KITCHEN = createField(DSL.name("Kitchen"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.LivingRoom</code>.
     */
    public final TableField<PropertyRecord, String> LIVINGROOM = createField(DSL.name("LivingRoom"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Name</code>.
     */
    public final TableField<PropertyRecord, String> NAME = createField(DSL.name("Name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Parking</code>.
     */
    public final TableField<PropertyRecord, Boolean> PARKING = createField(DSL.name("Parking"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.PetFriendly</code>.
     */
    public final TableField<PropertyRecord, Boolean> PETFRIENDLY = createField(DSL.name("PetFriendly"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Picture</code>.
     */
    public final TableField<PropertyRecord, String> PICTURE = createField(DSL.name("Picture"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Price</code>.
     */
    public final TableField<PropertyRecord, Double> PRICE = createField(DSL.name("Price"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Rating</code>.
     */
    public final TableField<PropertyRecord, Integer> RATING = createField(DSL.name("Rating"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Sauna</code>.
     */
    public final TableField<PropertyRecord, Boolean> SAUNA = createField(DSL.name("Sauna"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Smoking</code>.
     */
    public final TableField<PropertyRecord, Boolean> SMOKING = createField(DSL.name("Smoking"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Spa</code>.
     */
    public final TableField<PropertyRecord, Boolean> SPA = createField(DSL.name("Spa"), SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>booking_app.property.Terrace</code>.
     */
    public final TableField<PropertyRecord, String> TERRACE = createField(DSL.name("Terrace"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Type</code>.
     */
    public final TableField<PropertyRecord, String> TYPE = createField(DSL.name("Type"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>booking_app.property.Wifi</code>.
     */
    public final TableField<PropertyRecord, Boolean> WIFI = createField(DSL.name("Wifi"), SQLDataType.BIT.nullable(false), this, "");

    private Property(Name alias, Table<PropertyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Property(Name alias, Table<PropertyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>booking_app.property</code> table reference
     */
    public Property(String alias) {
        this(DSL.name(alias), PROPERTY);
    }

    /**
     * Create an aliased <code>booking_app.property</code> table reference
     */
    public Property(Name alias) {
        this(alias, PROPERTY);
    }

    /**
     * Create a <code>booking_app.property</code> table reference
     */
    public Property() {
        this(DSL.name("property"), null);
    }

    public <O extends Record> Property(Table<O> child, ForeignKey<O, PropertyRecord> key) {
        super(child, key, PROPERTY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : BookingApp.BOOKING_APP;
    }

    @Override
    public Identity<PropertyRecord, Integer> getIdentity() {
        return (Identity<PropertyRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PropertyRecord> getPrimaryKey() {
        return Keys.KEY_PROPERTY_PRIMARY;
    }

    @Override
    public Property as(String alias) {
        return new Property(DSL.name(alias), this);
    }

    @Override
    public Property as(Name alias) {
        return new Property(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Property rename(String name) {
        return new Property(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Property rename(Name name) {
        return new Property(name, null);
    }
}
