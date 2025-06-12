# Ejercicio 6: Calcular el factorial de un número mayor o igual a 0

num = int(input("Ingrese un número: "))

if num < 0:
    print("El número debe ser mayor o igual a 0")
else:
    i = 1
    factorial = 1

    while i <= num:
        factorial = factorial * i
        i = i + 1

print("El facotrial de:", num, "es:", factorial)