"""
Ejercicio: Convertidor de temperaturas

Realizar dos funciones para convertir de grados Celsius a Fahrenheit, y viceversa.
"""

def celsiusAFahrenheit(c):
    f = c * 1.8 + 32

    print(f"{c}° grados Celsius equivalen a {f}° grados Fahrenheit")

def fahrenheitACelsius(f):
    c = (f - 32) / (1.8)

    print(f"{f}° grados Fahrenheit equivalen a {c}° grados Celsius")

celsiusAFahrenheit(30)
fahrenheitACelsius(70)