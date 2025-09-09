"""
Ejercicio: Función con *args para multiplicar.

Crear una función para multiplicar los valores recibidos de tipo numérico, utilizando argumentos variables *args
como parámetro de la función y regresar como resultado la multiplicación de todos los valores recibidos
como argumentos.
"""

def multiplicar(*nums):
    resultado = 1
    for num in nums:
        resultado = resultado * num

    return resultado

# Llamar a la función
multiplicar(2, 4, 3) 