from items.item import Item

class Device(Item):
    def __init__(self, device_purpose, name, item_type, country_manufacturer, price, material, weight):
        self.device_purpose = device_purpose
        self.name = name
        super().__init__(item_type, country_manufacturer, price, material, weight)
    def __repr__(self):
        return f"Device purpose - {self.device_purpose} Name - {self.name} Item_type - {self.item_type} Country - {self.country_manufacturer } Price - {self.price} Material - {self.material} Weight - {self.weight}\n"

class Dishwasher(Device):
    def __init__(self, capacity, noise_level, device_purpose, name, item_type, country_manufacturer, price, material, weight):
        self.capacity = capacity
        self.noise_level = noise_level
        super().__init__(device_purpose, name, item_type, country_manufacturer, price, material, weight)
    def __repr__(self):
        return f"Capacity - {self.capacity} Noise level - {self.noise_level} Name - {self.name} Item_type - {self.item_type} Country - {self.country_manufacturer} Price - {self.price} Material - {self.material} Weight - {self.weight}\n"

class POS(Device):
    def __init__(self, os_type, display_type, ram, device_purpose, name, item_type, country_manufacturer, price, material, weight):
        self.os_type = os_type
        self.display_type = display_type
        self.ram = ram
        super().__init__(device_purpose, name, item_type, country_manufacturer, price, material, weight)
    def __repr__(self):
        return f"Os_type - {self.os_type} Display_type - {self.display_type} Ram - {self.ram} Device purpose - {self.device_purpose} Name - {self.name} Item_type - {self.item_type} Country - {self.country_manufacturer} Price - {self.price} Material - {self.material} Weight - {self.weight}\n"