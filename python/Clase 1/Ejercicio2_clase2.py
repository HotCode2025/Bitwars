#uso de rangos
#Sintaxis de range (inicio, fin, incremento)

# Ejercicio 3: crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1
print("Rango de 3 a 10, con incremento de 2")
for i in range(3,10,2):
    print(i)
# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3
print("Rango de 0 a 10 con numeros divisibles entre 3")
for i in range(11):
    if i%3==0:
        print(i)

# Ejercicio 2: Crear un rango de numeros de 2 a 6
print("Rango de numeros entre 2 y 6")
rango = range(2,7)
for i in rango:
    print(i)
