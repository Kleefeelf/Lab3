package ua.lviv.iot.bar.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.bar.models.Glass;
import ua.lviv.iot.bar.repositories.GlassRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Data
@Service
public class GlassService {

    @Autowired
    private GlassRepository glassRepository;


    public List<Glass> getAllGlasses() {
       return glassRepository.findAll();
    }

    public Glass getGlass(Integer id) {
        return glassRepository.findById(id).orElseThrow();
    }

    public Glass addGlass(Glass glass) {
        return glassRepository.save(glass);
    }

    public Glass changeGlass(Integer id, Glass glass){
        if (glassRepository.existsById(id)) {
            glass.setId(id);
            return glassRepository.save(glass);
        }
        throw new NoSuchElementException();
    }

    public Glass deleteGlass(Integer id) {
        Glass glass = glassRepository.findById(id).orElseThrow();
        glassRepository.deleteById(id);
        return glass;
    }
}
