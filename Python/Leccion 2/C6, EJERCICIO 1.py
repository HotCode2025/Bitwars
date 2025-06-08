# Ejercicio 1: Escribir la siguiente expresion en forma de expresion algoritmica
# A3 x (b2-2ac)/2b

a = float(input("Digite el valor de a: "))
b = float(input("Digite el valor de b: "))
c = float(input("Digite el valor de c: "))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
print(f"El resultado es: {resultado}")