package com.example.Booking.controller;

import com.example.Booking.model.Property;
import com.example.Booking.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {

    private final PropertyService propertyService;

    @Autowired
    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Property>> getAllProperties() {
        List<Property> propertyList = propertyService.findAllProperties();
        return new ResponseEntity<>(propertyList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Property> addProperty(@RequestBody Property property) {
        Property newProperty = propertyService.addProperty(property);
        return new ResponseEntity<>(newProperty, HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity<Property> updateProperty(@RequestBody Property property) {
        Property updateProperty = propertyService.updateProperty(property);
        return new ResponseEntity<>(updateProperty, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProperty(@PathVariable("id") Long id) {
        propertyService.deleteProperty(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Property> getPropertyById(@PathVariable("id") Long id) {
        Property newProperty = propertyService.findPropertyById(id);
        return new ResponseEntity<>(newProperty, HttpStatus.OK);
    }


}
