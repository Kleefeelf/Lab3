import unittest
from CounterBarManager import CounterBarManager
from items.furniture import Chair, CounterBar
from items.device import POS, Dishwasher
from items.tableware import Glass, Plate
from items.country import Country

 

class TestCounterBarManager(unittest.TestCase):
    test_bar = CounterBarManager()
    chair = Chair("Zruchno", "Krislo", Country.USA, 150, "Derevo", 250, 50, 25, "Zaokruglena")
    dishwasher = Dishwasher(50, 50, "Mitu posud", "Dish200", "Dishwasher", Country.Ukraine , 1500, "Zalizo", 2500)
    glas = Glass(10, "Prozoriy","Gravirovka", "Ukrainski chashki", "Chashka", Country.USA, 350, "Glass", 150)
    test_bar.buyEquip(chair)
    test_bar.buyEquip(dishwasher)
    test_bar.buyEquip(glas)

    def test_init(self):
        self.assertEqual(self.test_bar.items, [self.chair, self.dishwasher, self.glas])
        
    def test_searchByItemMaterial(self):
        needed_material = self.test_bar.searchByItemMaterial(material="Glass")
        self.assertEqual(needed_material, [self.glas])

    def test_sortByPrice(self):
        needed_price_order = self.test_bar.sortByPrice()
        self.assertEqual(needed_price_order, [self.chair, self.glas, self.dishwasher])
    
    def test_sortByWeight(self):
        needed_weight_order = self.test_bar.sortByWeight()
        self.assertEqual(needed_weight_order, [self.glas, self.chair, self.dishwasher])


    