#lista = Ariel, Liliana, Natalia, Osvaldo
nombres=["Naty","Osvaldo", "Lily","Ariel"]
print(nombres[0])

#para acceder a los elementos de forma inversa
#cuando se quiere ver el ultimo elemento

print([nombres[-1]])

#para el penultimo
print([nombres[-2]])

#para recuperar un rango de la lista
print(nombres[0:2]) #muestra la posicion 0 y 1

#ir del inicio de la lista al indice (sin incluirlo)
print(nombres[0:3]) #muestra indce 0,1,2

print(nombres[1:])

#modificar un valor de la lista
nombres[3]="Maria"
print(nombres)

#iterar una lista con un ciclo for
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

#cuantos elementos tiene una lista
print(len(nombres)) #funcion len

#agregar un elemento
nombres.append("Ivana") #la funcion append lo agrega al elemento en el ultimo lugar
print(nombres)

#agregar en un lugar especifico
nombres.insert(1,"Alberto")
print(nombres)

#eliminamos un elemento
nombres.remove("Alberto")
print(nombres)

#eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar un indice especifico
del nombres[2]
print(nombres)

#eliminar todos los elementos de la lista
nombres.clear()
print(nombres)

#eliminar lista
del nombres
print(nombres)
