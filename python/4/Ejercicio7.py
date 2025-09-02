# ejercicio 7 juego adivina el numero

import random

secreto = random.randint(1,100)
intentos = 0

while True:
    num = int(input("tira un numero del 1 al 100: "))
    intentos += 1
    if num == secreto:
        print("adivinaste en", intentos, "intentos")
        break
    elif num < secreto:
        print("es mas grande")
    else:
        print("es mas chico")
