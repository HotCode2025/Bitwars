class Persona2: 
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


# Si un parámetro no tiene método setter es read-only, no se puede modificar el atributo
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad


persona = Persona2("Francesco", "Cornachione", 19)

print(persona.nombre) # Llamar al método GETTER