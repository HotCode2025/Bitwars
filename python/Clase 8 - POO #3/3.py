# Crear tres objetos más, utilizando los métodos getter y setter
# Para modificar y mostrar los cambios con el mostrar_detalles() 

class Persona: 
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Nombre: {self.nombre}, Apellido: {self._apellido}, Edad: {self._edad}")

    @property
    def nombre(self): # Getter
        # print("Método GET")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        # print("Método SET")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido
        
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

# Crear 3 objetos
persona1 = Persona("Juan", "Fernández", 28)
persona2 = Persona("Alberto", "Jiménez", 39)
persona3 = Persona("Marta", "González", 64)

# Mostrar los atributos de cada persona con el método getter
print(persona1.nombre)
print(persona2.apellido)
print(persona3.edad)

# Modificar con el método setter
persona1.nombre = "Héctor"
persona2.apellido = "Betancud"
persona3.edad = 21

# Mostrar cambios
print(persona1.nombre)
print(persona2.apellido)
print(persona3.edad)

# Mostrar detalles con el método mostrar_detalles()
persona1.mostrar_detalles()
persona2.mostrar_detalles()
persona3.mostrar_detalles()