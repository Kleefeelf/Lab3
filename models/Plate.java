package ua.lviv.iot.bar.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@FieldDefaults(level = AccessLevel.PUBLIC)
@Data
@SuperBuilder
@ToString(callSuper = true)
public class Plate extends Tableware{
    @NonNull int diameter;
    @NonNull int depth;
}
