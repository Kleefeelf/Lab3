from items.furniture import Chair, CounterBar
from items.device import POS, Dishwasher
from items.tableware import Glass, Plate

class CounterBarManager:
    def __init__(self):
        self.items = []
    
    def buyEquip(self, item):
        self.items.append(item)
    
    def sortByWeight(self):
        bought_items = []
        self.items.sort(key=lambda item: item.weight, reverse=False)
        bought_items = self.items
        return bought_items

    def sortByPrice(self):
        bought_items = []
        self.items.sort(key=lambda item: item.price, reverse=False)
        bought_items = self.items
        return bought_items

    def searchByItemMaterial(self, material = "Glass", reversed = True):
        bought_items = []
        for item in self.items:
            if item.material == material:
                bought_items.append(item)
        bought_items.sort(key=lambda item: item.price, reverse=reversed)
        return bought_items
