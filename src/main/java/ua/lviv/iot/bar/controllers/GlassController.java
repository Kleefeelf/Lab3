package ua.lviv.iot.bar.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.bar.models.Glass;
import ua.lviv.iot.bar.services.GlassService;

import java.util.List;

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
    public Glass getGlass(@PathVariable int id) {
        return glassService.getGlass(id);
    }

    @PostMapping("/glasses")
    public void addGlass(@RequestBody Glass glass) {
        glassService.addGlass(glass);
    }

    @PutMapping("/glasses/{id}")
    public ResponseEntity<Glass> changeGlass(@RequestBody Glass glass, @PathVariable int id) {
        Glass tmpGlass = glassService.getGlassMap().get(id);
        if (tmpGlass != null){
            glass.setId(id);
            glassService.changeGlass(id, glass);
            return ResponseEntity.ok(glass);
        }
        return  ResponseEntity.notFound().build();
    }

    @DeleteMapping("/glasses/{id}")
    public void deleteGlass(@PathVariable int id) {
        glassService.deleteGlass(id);
    }
}
