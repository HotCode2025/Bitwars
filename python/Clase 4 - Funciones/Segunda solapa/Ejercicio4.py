"""
Ejercicio 4: Sumar números pares dentro de un rango

Hacer un programa para sumar números pares dentro de un rango, por ejemplo: 
Suma de números pares del 2 al 30: 240
"""

def paresRango(inicio, fin):
    suma = 0

    for i in range(inicio, fin, 2):
        suma += i

    return suma

inicio = int(input("Ingresa el primer número del rango: "))
fin = int(input("Ingresa el segundo número del rango: "))

print(f"Suma de números pares del {inicio} al {fin}: {paresRango(inicio, fin)}")