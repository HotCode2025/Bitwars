class Persona: # Creamos una clase
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

persona1 = Persona('Ernesto', 'Fernández', 39)
print(persona1.nombre) # Ernesto
print(persona1.apellido) # Fernández
print(persona1.edad) # 39

# Atributos: Características
# Métodos: El comportamiento de los objetos