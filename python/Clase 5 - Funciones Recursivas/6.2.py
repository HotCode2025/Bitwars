# Ejercicio 11: Agenda Telefonica
# Hacer un programa que simule una agenda de contactos 
# usando un diccionario donde la clave sea el nombre del usuario
# el valor sea el teléfono. El programa tendrá este menú:
#       1. Nuevo contacto
#       2. Borrar contacto
#       3. Ver contactos existentes
#       4. Salir



agenda = {}  # Diccionario vacío para los contactos

while True:
    print("\n --- Agenda Telefónica ---")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")
    
    opcion = input("Elige una opción: ")

    if opcion == "1":
        nombre = input("Ingrese el nombre: ")
        telefono = input("Ingrese el teléfono: ")
        agenda[nombre] = telefono
        print(f"Contacto {nombre} agregado.")

    elif opcion == "2":
        nombre = input("Ingrese el nombre a borrar: ")
        if nombre in agenda:
            del agenda[nombre]
            print(f"Contacto {nombre} eliminado.")
        else:
            print("El contacto no existe.")

    elif opcion == "3":
        if agenda:
            print("\n--- Lista de contactos ---")
            for nombre, telefono in agenda.items():
                print(f"{nombre}: {telefono}")
        else:
            print("La agenda está vacía.")

    elif opcion == "4":
        print("Saliendo de la agenda...")
        break

    else:
        print("Opción no válida, intenta nuevamente.")
agenda = {}  
