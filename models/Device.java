package ua.lviv.iot.bar.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Device extends Item{
    @NonNull String devicePurpose;
    @NonNull String name;
}
