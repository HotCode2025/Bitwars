#Diseñar un programa que ingresado un año, nos devuelava
#por consola si es un año bisiesto o no, repetir la accion
#hasta que el usuario lo desida.

opcion = 0

while opcion != 1:
    año = int(input("Ingrese un año: "))
    if (año % 4 == 0 and año % 100 != 0) or año % 400 == 0:
        print("El año", año, "es bisiesto")
    else:
        print("El año", año, "no es bisiesto")

    print("\n¿Verificar otro año?")
    print("0 = Sí")
    print("1 = No")
    opcion = int(input("Elegí una opción (0 o 1): "))