package ua.lviv.iot.bar.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.bar.models.Country;

@Data
@SuperBuilder
@NoArgsConstructor
public class Item {
    @NonNull String itemType;
    @NonNull Country countryManufacturer;
    @NonNull int price;
    @NonNull String material;
    @NonNull int weight;
}
