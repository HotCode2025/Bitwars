"""
    Definir una clase padre llamada Vehiculo y dos hijas llamadas Auto y Bicicleta, las cuales
    heredan de la clase padre Vehiculo. La clase padre debe tener los siguientes atributos y métodos:

    Vehiculo (clase padre)

    - Atributos: (color, ruedas)
    - Métodos: (__init__(color, ruedas) y __str__())
    
    Auto (clase hija de Vehiculo)

    - Atributos: (velocidad (km/h))
    - Métodos (__init__(color, ruedas, velocidad) y __str__())

    Bicicleta (clase hija de Vehiculo)

    - Atributos: (tipo (urbana/montaña, etc))
    - Métodos: (__init__(color, ruedas, tipo) y __str__())

    Crear un objeto de cada clase
"""

class Vehiculo:
    # Método constructor
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
    # Método que devuelve una representación en string del objeto
        return f"Color: {self.color}, Ruedas: {self.ruedas}"

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        Vehiculo.__init__(color, ruedas) # Hereda color y ruedas de Vehiculo (clase padre)
        self.velocidad = velocidad

    def __str__(self):
        return f"Auto de color: {self.color}, ruedas: {self.ruedas}, velocidad: {self.velocidad}"

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        Vehiculo.__init__(self, color, ruedas)  # Llamada directa a la clase padre
        self.tipo = tipo

    def __str__(self):
        return f"Bicicleta de color: {self.color}, ruedas: {self.ruedas}, tipo: {self.tipo}"


auto1 = Auto("verde", 4, 200)
bicicleta1 = Bicicleta("roja", 2, "montaña")
moto = Vehiculo("azul", 2)

print(auto1)
print(bicicleta1)
print(moto)



    