package ua.lviv.iot.bar.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper = true)
public final class Chair extends Furniture{
    @NonNull String comfort;
}
