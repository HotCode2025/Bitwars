# Ejercicio 1: Numero par o impar

a = int(input("Digite un numero: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un numero PAR")
else:
    print(f"El valor de a es: {a} es un numero IMPAR")
