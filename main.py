from CounterBarManager import CounterBarManager
from items.furniture import Chair, CounterBar
from items.device import POS, Dishwasher
from items.tableware import Glass, Plate
from items.country import Country



if __name__ == "__main__":
    bar = CounterBarManager()
    chair = Chair("Zruchno", "Krislo", Country.USA, 150, "Derevo", 250, 50, 25, "Zaokruglena")
    dishwasher = Dishwasher(50, 50, "Mitu posud", "Dish200", "Dishwasher", Country.Ukraine , 1500, "Zalizo", 2500)
    glas = Glass(10, "Prozoriy","Gravirovka", "Ukrainski chashki", "Chashka", Country.USA, 350, "Glass", 150)
    bar.buyEquip(chair)
    bar.buyEquip(dishwasher)
    bar.buyEquip(glas) 

    print(bar.items)
    print("#######################################")
    print(bar.searchByItemMaterial())
    print("#######################################")
    bar.sortByPrice()
    print(bar.items)
    print("#######################################")
    bar.sortByWeight()
    print(bar.items)
    unittest.main()
    #as