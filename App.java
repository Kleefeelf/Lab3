package ua.lviv.iot.bar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ua.lviv.iot.bar.manager.*;
import ua.lviv.iot.bar.models.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Chair krislo = Chair.builder()
                .comfort("Zruchno")
                .countryManufacturer(Country.BHUTAN)
                .form("Hrest")
                .itemType("Krislo")
                .height(2)
                .width(1)
                .weight(1000)
                .price(100)
                .material("Derevo")
                .build();
        Glass chashka = Glass.builder()
                .countryManufacturer(Country.CHINA)
                .itemType("Stakan")
                .material("Glass")
                .price(25)
                .brand("Nefrit Cups")
                .design("Gravirokva")
                .weight(450)
                .opacity("Prozoriy")
                .volume(30)
                .build();
        Plate plate = Plate.builder()
                .depth(2)
                .brand("Nefrit Plates")
                .countryManufacturer(Country.USA)
                .itemType("Tarikla")
                .design("Print")
                .material("Nefrit")
                .price(150)
                .weight(20)
                .diameter(30)
                .build();


        List<Item> barItems = new ArrayList<Item>();
        barItems.add(krislo);
        barItems.add(plate);
        barItems.add(chashka);
        System.out.println(barItems.toString());
        CounterBarManager bar = new CounterBarManager(barItems);
        System.out.println("########################### SEARCHING GLASS ITEMS ###########################");
        System.out.println(bar.searchByGlassMaterial("Glass"));
        System.out.println("########################### SORTING ITEMS BY PRICE ###########################");
        bar.sortByPrice(false);
        System.out.println(bar.getItems());
        System.out.println("########################## SORTING ITEMS BY WEIGHT ###########################");
        bar.sortByWeight(false);
        System.out.println(bar.getItems());
    }
}
