# Ejercicio 5: Sistema de calificacion
calificacion = int(input("Digite una calificacion entre 0 y 10: "))
if 9 <= calificacion <= 10:
    print("A")
if 8 <= calificacion <= 9:
    print("B")
if 7 <= calificacion <= 8:
    print("C")
if 6 <= calificacion <= 7:
    print("D")
if 0 <= calificacion <= 6:
    print("F") 
else:
    print("Valor incorrecto..")