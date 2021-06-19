from items.item import Item

class Tableware(Item):
    def __init__(self, design, brand,  item_type, country_manufacturer, price, material, weight):
        self.design = design
        self.brand = brand
        super().__init__(item_type, country_manufacturer, price, material, weight)
    def __repr__(self):
        return f"Design - {self.design} Brand - {self.design} Item_type - {self.item_type} Country - {self.country_manufacturer} Price - {self.price} Material - {self.material} Weight - {self.weight}\n"

class Glass(Tableware):
    def __init__(self, volume, opacity, design, brand,  item_type, country_manufacturer, price, material, weight):
        self.volume = volume
        self.opacity = opacity
        super().__init__(item_type, design, brand, country_manufacturer, price, material, weight)
    def __repr__(self):
        return f"Volume - {self.volume} Opacity - {self.opacity} Design - {self.design} Brand - {self.design} Item_type - {self.item_type} Country - {self.country_manufacturer} Price - {self.price} Material - {self.material} Weight - {self.weight}\n"
    

class Plate(Tableware):
    def __init__(self, diameter, depth, design, brand,  item_type, country_manufacturer, price, material, weight):
        self.diameter = diameter
        self.depth  = depth
        super().__init__( design, brand,  item_type, country_manufacturer, price, material, weight)
    def __repr__(self):
        return f"Diameter - {self.diameter} Design - {self.design} Brand - {self.design} Item_type - {self.item_type} Country - {self.country_manufacturer} Price - {self.price} Material - {self.material} Weight - {self.weight}\n"