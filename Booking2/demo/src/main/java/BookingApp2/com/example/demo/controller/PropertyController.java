package BookingApp2.com.example.demo.controller;

import BookingApp2.com.example.demo.entities.tables.pojos.Property;
import BookingApp2.com.example.demo.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;


    @GetMapping("/all")
    public List<Property> getAllProperties() {
       return propertyService.findAll();
    }

    @PostMapping("/add")
    public int addProperty(@RequestBody Property property) {
        return propertyService.add(property);
    }

    @PutMapping("/update")
    public int updateProperty(@RequestBody Property property) {
        return propertyService.update(property);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteProperty(@PathVariable int id) {
        return propertyService.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Property getPropertyById(@PathVariable int id) {
        return propertyService.findById(id);
    }

}
