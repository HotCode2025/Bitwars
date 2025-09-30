#Ejercicio 10: no repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres

cadena = input("Ingresar una cadena: ")

lista_caracteres = []

for caracter in cadena:
    if caracter not in lista_caracteres:
        lista_caracteres.append(caracter)


print("Lista sin caracteres repetidos:", lista_caracteres)
