#Ejercicio 5.2
#Ejercicio 5: Factorial de un número positivo
#Hacer un programa para calcular el factorial de un número positivo

# Solicitamos al usuario que ingrese un número entero
try:
    numero = int(input("Ingrese un número entero positivo para calcular su factorial: "))
except ValueError:
    print("Entrada no válida. Por favor, ingrese un número entero.")
else:
    # Verificamos si el número es negativo
    if numero < 0:
        print("El factorial no está definido para números negativos.")
    # El factorial de 0 es 1
    elif numero == 0:
        print("El factorial de 0 es 1.")
    # Calculamos el factorial para números positivos
    else:
        factorial = 1
        for i in range(1, numero + 1):
            factorial *= i
        print(f"El factorial de {numero} es {factorial}.")