class Aritmetica:
  """
  Documentacion de la clase de Python
  este tipo de comentario es: DocString
  """  
  def __init__(self, operandoA, operandoB):
    self.operandoA = operandoA
    self.operandoB = operandoB

  #Metodo para sumar
  def sumar (self):
    return self.operandoA + self.operandoB
    
  def restar (self):
    return self.operandoA - self.operandoB
  
  def multiplicar(self):
    return self.operandoA* self.operandoB
  
  def dividir(self):
    return self.operandoA/self.operandoB
  

aritmetica1 = Aritmetica(7, 9) #colocamos dos argumentos
print(aritmetica1.sumar())
print(f'la resta de los numeros es: {aritmetica1.restar()}')
print(f'la multiplicacion de los numeros es: {aritmetica1.multiplicar()}')
print(f'la division de los numeros es: {aritmetica1.dividir():.2f}')
