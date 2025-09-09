"""
Ejercicio: Función Recursiva

Imprimir números desde n a 1 de manera descendente usando funciones recursivas. 
Puede ser cualquier valor positivo, por ejemplo: si pasamos el valor de 5, debe imprimir:

5
4
3
2
1
"""

def hastaUno(n):
    if n > 0:
        print(n)
        hastaUno(n - 1)
    
    
hastaUno(10)