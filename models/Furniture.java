package ua.lviv.iot.bar.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
@ToString(callSuper = true)
public class Furniture extends Item{
    @NonNull float height;
    @NonNull float width;
    @NonNull String form;
}
