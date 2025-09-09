# Como tarea agregar y actualizar los jugadores del diccionario: seleccionArgentina.

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 38, 'Altura': 1.70, 'Precio': '18,00 millones', 'Posicion': 'Extremo derecho'},
    22: {'Nombre': 'Lautaro Martinez', 'Edad': 28, 'Altura': 1.74, 'Precio': '95,00 millones', 'Posicion': 'Delantero Centro'},
    20: {'Nombre': 'Alexis Mac Allister', 'Edad': 26, 'Altura': 1.76, 'Precio': '100,00 millones', 'Posicion': 'Mediocentro'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 37, 'Altura': 1.83, 'Precio': '1,00 millones', 'Posicion': 'Defensa Central'},
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 32, 'Altura': 1.95, 'Precio': '20,00 millones', 'Posicion': 'Arquero'},
    5: {'Nombre': 'Leandro Paredes', 'Edad': 31, 'Altura': 1.80, 'Precio': '5,00 millones', 'Posicion': 'Mediocampista'},
    24: {'Nombre': 'Enzo Fernandez', 'Edad': 24, 'Altura': 1.74, 'Precio': '75,00 millones', 'Posicion': 'Mediocentro'},
    7: {'Nombre': 'Rodrigo De Paul', 'Edad': 31, 'Altura': 1.80, 'Precio': '25,00 millones', 'Posicion': 'Mediocentro'},
    15: {'Nombre': 'Thiago Almada', 'Edad': 24, 'Altura': 1.74, 'Precio': '25,00 millones', 'Posicion': 'Mediocentro Ofencivo'}
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print('Tenemos cargado en el diccionario la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))
