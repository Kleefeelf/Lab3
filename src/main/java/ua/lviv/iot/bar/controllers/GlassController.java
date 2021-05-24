package ua.lviv.iot.bar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.bar.models.Glass;
import ua.lviv.iot.bar.services.GlassService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bar")
public class GlassController {

    @Autowired
    private GlassService glassService;

    @GetMapping("/glasses")
    public List<Glass> getAllGlasses() {
        return glassService.getAllGlasses();
    }

    @GetMapping("/glasses/{id}")
    public ResponseEntity getGlass(@PathVariable final Integer id) {
        try {
            Glass glass = glassService.getGlass(id);
            return ResponseEntity.ok(glass);
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(404).build();
        }
    }

    @PostMapping("/glasses")
    public ResponseEntity<Glass> addGlass(@RequestBody Glass glass) {
        if (glass.getId() == null) {
            return new ResponseEntity<Glass>(glassService.addGlass(glass), HttpStatus.OK);
        }
        return new ResponseEntity<Glass>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/glasses")
    public ResponseEntity<Glass> changeGlass(@RequestBody Glass glass) {
        if(glass.getId() == null) {
            return new ResponseEntity<Glass>(HttpStatus.BAD_REQUEST);
        }
        try {

            return new ResponseEntity<Glass>(glassService.changeGlass(glass.getId(), glass), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/glasses/{id}")
    public ResponseEntity deleteGlass(@PathVariable final int id) {
       try {
           Glass glass = glassService.getGlass(id);
           return ResponseEntity.ok(glassService.deleteGlass(id));
       } catch (NoSuchElementException e) {
           return ResponseEntity.status(404).build();
       }
    }
}
