package ua.lviv.iot.bar.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
@ToString(callSuper = true)
public class Tableware extends Item{
    @NonNull String design;
    @NonNull String brand;
}
