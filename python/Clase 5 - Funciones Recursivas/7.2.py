# Función con valores por defecto
def sumar2(a = 0, b = 0):
    return a + b

resultado = sumar2()
print(f"Resultado de la suma: {resultado}") # Valores por defecto
print(f"Resultado de la suma: {sumar(2, 3)}") 

def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)

listarNombres('Colo', 'Fran', 'Tomi', 'Mari', 'Pablo')

def listarTerminos(**terminos): # Diccionario de valores indefinidos 
    for clave, valor in terminos.items():
        print(f"{clave}: {valor}")

listarTerminos(IDE = 'Integrated Development Environment', PK = 'Primary Key')
listarTerminos(Nombre = 'Lionel Messi')