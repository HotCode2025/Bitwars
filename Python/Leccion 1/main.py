miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x080
print(id(y))
print(id(z))


#Tipos int, float, String, Bool

x = 10 
print(x)
print(type(x))

x = 14.5
print(x)
print(type(x))

x = "Hola profe"
print(x)
print(type(x))

x = True
print(x)
print(type(x))

x = False
print(x)
print(type(x))




#Manejo de cadenas (String)
miEquipoFavorito = "Boca Juniors: "
caracteristicas = "Argentina"
print("Mi equipo favorito es:", miEquipoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))


#Tipos de Booleanos (Bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")


#Procesar la esntrada del usuario
#funcion input
resultado = input("Digite un numero: ") # Regresa un dato tipo string
print(resultado)


#Conversion de la entrada de datos
numero1 = int(input("Escribe le primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)



