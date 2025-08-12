#Calcular la calificacion mas baja y promedio de un grupo de 10 alumnos

suma = 0
calificacion_baja = float('inf')

for i in range(10):
    calificacion = float(input(f"Ingrese la calificación del alumno {i + 1}: "))
    while calificacion < 0 or calificacion > 10:
        calificacion = float(input(f"Ingrese nuevamente la calificación del alumno {i + 1} (entre 0 y 10): "))
    
    suma += calificacion

    if calificacion < calificacion_baja:
        calificacion_baja = calificacion

calificacion_promedio = suma / 10
print(f"La calificación promedio es: {calificacion_promedio}")
print(f"La calificación más baja es: {calificacion_baja}")