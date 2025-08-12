# Ejercicio 4: Etapas de la vida
edad = int(input("Digite su edad: "))
mensaje = None
if 0 <= edad < 10:
    mensaje = "La infancia es increible y bella"
elif 10 <= edad < 20:
    mensaje = "Tenes muchos cambios y hay que estudiar"
elif 20 <= edad < 30:
    mensaje = "Amor y comienza el laburo"
else:
    mensaje = "Error, esta etapa de la vida no es reconocida"
print(f"Tu edad es: {edad}, {mensaje}")