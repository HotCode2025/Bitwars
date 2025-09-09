#Ejercicio 4.7
#Ejercicio 2: Modificar los elementos de una lista
#LLenar una lista con los numeros del 1 al 10, luego modificar los
# elementos de la lista multiplicandolos por un valor ingresado por el usuario

numeros = list(range(1, 11))
print("La lista original: ",numeros)

multiplicador = int(input("Ingresa un numero para multiplicar la lista: "))

for i in range(len(numeros)):
    numeros[i] *= multiplicador

print("La lista modificada es: ",numeros)