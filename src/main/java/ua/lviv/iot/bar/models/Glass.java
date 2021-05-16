package ua.lviv.iot.bar.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Glass {
    private int id;
    private int volume;
    private int price;
    private int weight;
    private String opacity;
    private String brand;
}
