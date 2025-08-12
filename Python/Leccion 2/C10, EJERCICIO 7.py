# Ejercicio 7: Ingresar "N" enteros, visualizar la suma de los números pares de
#  la lista, contar pares, y mostrar el promedio de los impares

pares = 0
suma_pares = 0
impares = 0
suma_impares = 0

n = int(input("Ingrese la cantidad de números de la lista: "))

for num in range(n):
    num = int(input("Ingrese un número: "))
    if num % 2 == 0:
        pares += 1
        suma_pares += num
    else:
        impares += 1
        suma_impares += num 

promedio_impares = suma_impares / impares
print("Suma de los pares:", suma_pares)
print("Cantidad de pares:", pares)

if impares == 0:
    print("No hay impares para promediar")
print("Promedio de impares:", promedio_impares)