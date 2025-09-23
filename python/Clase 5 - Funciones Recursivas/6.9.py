#Argumentos, variables en funciones
def listarNombres(*nombres): # Normalmente se utiliza: *args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
        listarNombres('Franchesco','Tomas', 'Maria','Valentin','Pablo')
        listarNombres('Marco', 'Pepe', 'Robert', 'John')
