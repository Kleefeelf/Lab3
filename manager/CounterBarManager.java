package ua.lviv.iot.bar.manager;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.bar.models.Item;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PUBLIC)
@Data
@AllArgsConstructor
@NoArgsConstructor
public final class CounterBarManager {
    List<Item> items;

    public List<Item> searchByGlassMaterial(final String material) {
        return items.stream().filter(item ->
                item.getMaterial().equals(material)).collect(Collectors.toList());
    }

    public void sortByPrice(boolean reversed) {
        if (reversed) {
            items.sort(Comparator.comparing(Item::getPrice));
        }
        else {
            items.sort(Comparator.comparing(Item::getPrice).reversed());
        }
    }

    public void sortByWeight(boolean reversed) {
        if (reversed) {
            items.sort(Comparator.comparing(Item::getWeight));
        }
        else {
            items.sort(Comparator.comparing(Item::getWeight).reversed());
        }
    }
}
