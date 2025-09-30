names = ["Pablo","colo","Maria","franco"]

alongP = [p for p in names if p[0].lower() == "p"]
print(alongP)

bottleC = [
    {"name": "Quilmes", "country": "Arg"},
    {"name": "corona", "country": "Mx"},
    {"name": "Stella Artois", "country": "Belgium"}
]

Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# paso de argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a traves de Youtube")
    print(f"Nombre: {name}, Apellido: {lastName}")

mi_funcion2("Jorge", "lucero")
mi_funcion2("Ariel", "Betancud")
mi_funcion2("Analia", "pedrosa")

# la palabra return en funciones
# creamos una funcion para sumar
def sumar(a, b):
    return a + b

resultado = sumar(78, 22)
print(f"El resultado de la suma es: {resultado}")

print(f"El resultado de la suma es: {sumar(55,45)}")

def sumar(a=0, b=0):  # le damos un valor por default
    return a + b

resultado = sumar()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar(22, 66)}")

