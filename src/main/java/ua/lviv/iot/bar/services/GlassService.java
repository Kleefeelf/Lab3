package ua.lviv.iot.bar.services;

import lombok.Data;
import org.springframework.stereotype.Service;
import ua.lviv.iot.bar.models.Glass;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Data
@Service
public class GlassService {

    private Map<Integer, Glass> glassMap = new HashMap<Integer, Glass>();
    private AtomicInteger id = new AtomicInteger(0);

    public List<Glass> getAllGlasses() {
        return glassMap.values().stream().collect(Collectors.toList());
    }

    public Glass getGlass(int id) {
        return glassMap.get(id);
    }

    public Glass addGlass(Glass glass) {
        int glassId = id.incrementAndGet();
        glass.setId(glassId);
        glassMap.put(glassId, glass);
        return glass;
    }

    public Glass changeGlass(int id, Glass glass){
        return glassMap.put(id, glass);
    }

    public void deleteGlass(int id) {
        glassMap.remove(id);
    }
}
