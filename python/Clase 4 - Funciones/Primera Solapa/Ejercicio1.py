"""
Ejercicio 1: Eliminar duplicados de una lista

Hacer un programa donde tenga una lista y que a continuación elimine los elementos repetidos, por último mostrar la lista.
"""

def eliminar_duplicados(lista):
    lista_sin_duplicados = [] # Lista vacía para guardar los elementos repetidos

    for elemento in lista:
        if elemento not in lista_sin_duplicados:
            lista_sin_duplicados.append(elemento)

    return lista_sin_duplicados


# Programa principal (lo de arriba es una función aparte, que es usada en este programa)
def main(): 
    lista_usuario = input("Ingrese una lista de elementos separados por espacios: ")

    lista_limpia = lista_usuario.split() # Separar los elementos ingresados con espacio () [Podrían ser comas, guiónes, etc]

    lista_sin_duplicados = eliminar_duplicados(lista_limpia) # Aplicando la función que elimina duplicados a la lista (limpia) que ingresó el usuario

    print(f"Lista original: {lista_original}")
    print(f"Lista sin duplicados: {lista_sin_duplicados}")

if __name__ == "__main__":
    main()

