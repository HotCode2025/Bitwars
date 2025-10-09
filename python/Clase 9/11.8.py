"""
- Tarea: Encapsular los atributos y agregar los métodos Get & Set 
- Crear otro objeto, pasar los datos para nombre, edad y sueldo 
- Mostrar los datos, modificarlos y luego mostrarlos de nuevo
"""

class Persona:
  def __init__(self, nombre, edad):
    self.__nombre = nombre   # Encapsulado con doble guion bajo
    self.__edad = edad

  # Métodos Get
  
  @property
  def nombre(self):
    return self.__nombre

  @property
  def edad(self):
    return self.__edad

  # Métodos Set

  @nombre.setter
  def nombre(self, nombre):
    self.__nombre = nombre

  @edad.setter
  def edad(self, edad):
    self.__edad = edad


class Empleado(Persona):
  def __init__(self, nombre, edad, sueldo):
    super().__init__(nombre, edad)
    self.__sueldo = sueldo

  # Métodos Get

  @property
  def sueldo(self):
    return self.__sueldo

  # Métodos Set

  @sueldo.setter
  def sueldo(self, sueldo):
    self.__sueldo = sueldo



empleado1 = Empleado("Francesco Cornachione", 19, 900)
print("Empleado 1:")
print("Nombre:", empleado1.nombre)
print("Edad:", empleado1.edad)
print("Sueldo:", empleado1.sueldo)

# Objeto 2
empleado2 = Empleado("Lucía Pérez", 25, 1500)
print("\nEmpleado 2 (datos originales):")
print("Nombre:", empleado2.nombre)
print("Edad:", empleado2.edad)
print("Sueldo:", empleado2.sueldo)

# Modificar datos con los métodos Set
empleado2.nombre("Lucía Fernández")
empleado2.edad(26)
empleado2.sueldo(1800)

# Mostrar los datos modificados
print("\nEmpleado 2 (datos modificados):")
print("Nombre:", empleado2.nombre)
print("Edad:", empleado2.edad)
print("Sueldo:", empleado2.sueldo)
