from abc import ABC, abstractmethod

# ABC: Abstract Base Class

class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f"Valor del ancho erróneo: {ancho}")
        if self.validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f"Valor del alto erróneo: {alto}")

    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else: 
            print(f"Valor del ancho erroneo: {ancho}")


    @property
    def alto(self):
        return self._alto

    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f"Valor del alto erroneo: {alto}")


    @abstractmethod
    def calcular_area(self):
        return self.alto * self.ancho

    def __init__(self):
        return f"Ancho: {self.ancho}, Alto: {self.alto}"

    def validar_valores(self, valor):
        return True if 0 < valor < 10 else False