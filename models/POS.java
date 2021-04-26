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
public class POS extends Device{
    @NonNull String osType;
    @NonNull String displayType;
    @NonNull int ram;
}
