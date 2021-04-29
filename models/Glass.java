package ua.lviv.iot.bar.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@FieldDefaults(level = AccessLevel.PUBLIC)
@SuperBuilder
@ToString(callSuper = true)
public class Glass extends Tableware{
    @NonNull int volume;
    @NonNull String opacity;
}
