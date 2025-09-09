"""
Ejercicio 2: Operaciones de conjuntos con listas

Hacer un programa que tenga 2 listas y que a continuación cree las siguientes listas (en las que no debe haber repetición):

1. Lista de palabras que aparecen en las listas (lista1, lista2)
2. Lista de palabras que aparecen en la primera lista, pero no en la segunda (lista1_palabras)
3. Lista de palabras que aparecen en la segunda lista, pero no en la primera (lista2_palabras)
4. Lista de palabras que aparecen en ambas listas (lista_palabras)
"""

def operacionesListas():
    lista1 = input("LISTA 1: Ingrese los elementos separados por espacio: ").split()
    lista2 = input("LISTA 2: Ingrese los elementos separados por espacio: ").split()

    # Convertimos a conjuntos para evitar repeticiones
    set1 = set(lista1)
    set2 = set(lista2)

    # 1. Palabras que aparecen en ambas listas (unión)
    todas = list(set1 | set2)

    # 2. Palabras que están en la primera pero no en la segunda
    solo_lista1 = list(set1 - set2)

    # 3. Palabras que están en la segunda pero no en la primera
    solo_lista2 = list(set2 - set1)

    # 4. Palabras que aparecen en ambas listas (intersección)
    en_ambas = list(set1 & set2)

    print("1. Palabras en ambas listas:", todas)
    print("2. Solo en lista1:", solo_lista1)
    print("3. Solo en lista2:", solo_lista2)
    print("4. En ambas:", en_ambas)

# Llamada
operacionesListas()






