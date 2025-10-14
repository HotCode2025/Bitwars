from Cuadrado import cuadrado
from Rectangulo import rectangulo

print("Creación de objeto clase Cuadrado".center(50, '-'))

cuadrado1 = Cuadrado(5, 'Azul')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"Area del cuadrado: {cuadrado1.calcular_area()}")

# MRO - Method Resolution Order
print(Cuadrado.mro()) 

print(cuadrado1)

print("Creación de objeto clase Rectangulo".center(50, '-'))
rectangulo1 = Rectangulo(3, 8, "Verde")
print(rectangulo1)

figura1 = FiguraGeometrica() # No se puede instanciar, es abstracta