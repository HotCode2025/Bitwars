"""
Crear la clase Cubo con los atributos ancho, alto y profundidad. Con un método calcularVolumen() que tendrá la fórmula:
volumen = ancho * altura * profundidad. Que el usuario ingrese los valores
"""

class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcularVolumen(self):
        volumen = self.ancho * self.alto * self.profundidad
        return volumen

cubo1 = Cubo(2, 2, 3)
resultado = cubo1.calcularVolumen()
print(f"El volumen es: {resultado}")