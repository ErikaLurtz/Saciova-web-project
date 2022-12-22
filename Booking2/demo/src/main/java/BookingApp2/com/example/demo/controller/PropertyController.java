package BookingApp2.com.example.demo.controller;

import BookingApp2.com.example.demo.entities.tables.pojos.Property;
import BookingApp2.com.example.demo.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;


    @GetMapping("/all")
    public List<Property> getAllProperties() {
       return propertyService.getProperties();
    }

//    @PostMapping("/add")
//    public Property addProperty(@RequestBody Property property) {
//        Property newProperty = propertyService.addProperty(property);
//        return new ResponseEntity<>(newProperty, HttpStatus.OK);
//    }
//
//
//    @PutMapping("/update")
//    public ResponseEntity<Property> updateProperty(@RequestBody Property property) {
//        Property updateProperty = propertyService.updateProperty(property);
//        return new ResponseEntity<>(updateProperty, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteProperty(@PathVariable("id") Long id) {
//        propertyService.deleteProperty(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @GetMapping("/find/{id}")
//    public ResponseEntity<Property> getPropertyById(@PathVariable("id") Long id) {
//        Property newProperty = propertyService.findPropertyById(id);
//        return new ResponseEntity<>(newProperty, HttpStatus.OK);
//    }

}
