diccionario = {
    'IDE': 'Integrated Developement Environment',
    'OOP': 'Object Oriented Programming',
    'DBAS': 'Database Administrator System'
}

# Verificar la cantidad de elementos de un diccionario 
print(len(diccionario))

# Acceder a un diccionario con la llave (key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento 
print(diccionario.get('OOP'))

# Modificar elementos 
diccionario['IDE'] = 'integrated development environment'
print(diccionario['IDE'])

# Recorrer los elementos 
for key, value in diccionario.items():
    print(key, value)

# Recorrer solo llaves (keys)
for key in diccionario.keys():
    print(key)

# Recorrer solo valores (values)
for value in diccionario.values():
    print(value)

# Comprobar la existencia de algún elemento
print('IDE' in diccionario) # True or False

# Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Remover un elemento
diccionario.pop('PK')
print(diccionario)

# Vaciar un diccionario 
diccionario.clear()

# Eliminar diccionario
del diccionario