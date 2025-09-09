# Comenzamos con funciones
# mi funcion() No se puede llamar antes de definir una funcion
#Definimos una funcion
def mi_funcion(): # Para identificar a la funcion utilizamos parentesis
    print("Saludos a todos los alumnos de la Tecnicatura")

mi_funcion() # Estamos llamando a la funcion
mi_funcion() #Se puede llamar a una funcion N cantidad de veces

# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+' '+lastName)
person = ["Valentin", "Castillo"]
show(person[0], person[1]) #Pasamos uno por los datos de la lista de la funcion
show(*person) # Esto es lo mismo que el anteriror  pero pasamos todo junto
person2 = ("Ariel", "Bentancud") # desempaquetamos a traves de una tupla
show(*person2)