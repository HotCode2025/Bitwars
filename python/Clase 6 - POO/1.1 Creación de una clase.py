class Persona: # Creamos una clase
    def __init__(self):
        self.nombre = 'Francesco'
        self.apellido = 'Cornachione'
        self.edad = 19

persona1 = Persona()
print(persona1.nombre) # Francesco
print(persona1.apellido) # Cornachione
print(persona1.edad) # 19