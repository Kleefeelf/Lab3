from items.item import Item

class Furniture(Item):
    def __init__(self, item_type, country_manufacturer, price, material, weight, height, width, form):
        self.height = height
        self.width = width
        self.form = form
        super().__init__(item_type, country_manufacturer, price, material, weight)
    def __repr__(self):
        return f"Item type - {self.item_type} Country - {self.country_manufacturer} Price - {self.price} Material - {self.material} Weight - {self.weight} Height - {self.height} Width - {self.width} Form - {self.form}\n"

class Chair(Furniture):
    def __init__(self, comfort, item_type, country_manufacturer, price, material, weight, height, width, form):
        self.comfort = comfort
        super().__init__(item_type, country_manufacturer, price, material, weight, height, width, form)
    def __repr__(self):
        return f"Comfort - {self.comfort} Item type - {self.item_type} Country - {self.country_manufacturer} Price - {self.price} Material - {self.material} Weight - {self.weight} Height - {self.height} Width - {self.width} Form - {self.form}\n"

class CounterBar(Furniture):
    def __init__(self, decoration, item_type, country_manufacturer, price, material, weight, height, width, form):
        self.decoration = decoration
        super().__init__(item_type, country_manufacturer, price, material, weight, height, width, form)         
    def __repr__(self):
        return f"Deco - {self.decoration} Item type - {self.item_type} Country - {self.country_manufacturer} Price - {self.price} Material - {self.material} Weight - {self.weight} Height - {self.height} Width - {self.width} Form - {self.form}\n"