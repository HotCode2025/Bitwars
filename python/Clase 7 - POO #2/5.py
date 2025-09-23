"""
Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base
el nombre del método será calcular el área utilizando fórmula:
area= base * altura
Pero la base y la altura deben ser ingresadas por el usuario y los objetos deben ser
tres
"""
class Rectangulo:
  
    """
    Clase para representar un rectángulo y calcular su área.
    """
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        
        return self.base * self.altura

# Función para solicitar al usuario los datos y crear un objeto Rectangulo
def crear_rectangulo_con_entrada():
    """
    Pide al usuario que ingrese la base y la altura para crear un objeto Rectangulo.
    """
    while True:
      
            base = float(input("Ingrese la base del rectángulo: "))
            altura = float(input("Ingrese la altura del rectángulo: "))
            return Rectangulo(base, altura)
   

# Crear tres objetos Rectangulo y calcular sus áreas
print("--- Rectángulo 1 ---")
rectangulo1 = crear_rectangulo_con_entrada()
print(f"El área del Rectángulo 1 es: {rectangulo1.calcular_area()}")

print("\n--- Rectángulo 2 ---")
rectangulo2 = crear_rectangulo_con_entrada()
print(f"El área del Rectángulo 2 es: {rectangulo2.calcular_area()}")

print("\n--- Rectángulo 3 ---")
rectangulo3 = crear_rectangulo_con_entrada()
print(f"El área del Rectángulo 3 es: {rectangulo3.calcular_area()}")  
