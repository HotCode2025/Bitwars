#Ejercicio 4.3
#Ejercicio 3: Agregar personajes a una lista
#Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos

#Nombre: Aragon
#Clase: Guerrero
#Raza: Dúnadan del norte

#Nombre: Gandalf
#Clase: Mago
#Raza: Istar

#Nombre: Légolas
#Clase: Arquero
#Raza: Elfo Sindar

# Se crea una lista vacía
personajes = []

# Se crea un diccionario para cada personaje y se agrega a la lista
p1 = {'Nombre': 'Aragorn', 'Clase': 'Guerrero', 'Raza': 'Dúnadan del Norte'}
personajes.append(p1)

p2 = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
personajes.append(p2)

p3 = {'Nombre': 'Légolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(p3)

# Mostrar la lista de personajes
print(personajes)