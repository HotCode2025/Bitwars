#Leer 10 numero e imprimir cuantos son positivos
#cuantos negativos y cuantos neutros

conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

for i in range(1, 11):
    num = int(input(f"{i}. Digite un número: "))
    if num == 0:
        conteo_neutros += 1
    elif num > 0:
        conteo_positivos += 1
    else:
        conteo_negativos += 1

print("La cantidad de números positivos:", conteo_positivos)
print("La cantidad de números negativos:", conteo_negativos)
print("La cantidad de números neutros:", conteo_neutros)