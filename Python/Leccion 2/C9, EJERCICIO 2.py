# Calcular la suna "N" primero numeros

N = int(input("Digite la cantidad de números a sumarse: "))
suma = 0

for i in range(1, N + 1):
    suma += i

print("La suma es:", suma)