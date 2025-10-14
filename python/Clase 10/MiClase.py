class MiClase:
    # Variable de clase, este atributo dará a cada objeto el mismo valor
    variableClase = 'Esta es una variable de clase'

    def __init__(self, variableInstancia): # La variable de instancia, da diferentes valores
        self.variableInstancia = variableInstancia

print(MiClase.variableClase)