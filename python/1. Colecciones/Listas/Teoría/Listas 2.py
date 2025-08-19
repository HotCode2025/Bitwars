# lista = Ariel, Liliana, Natalia, Osvaldo

nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)

print(nombres[0:2]) #Muestra desde el índice 0 hasta el 1 (Naty, Osvaldo, Lily)
print(nombres[:3]) # Muestra los elementos desde el principio de la lista hasta el índice indicado
print(nombres[0: ]) # Muestra desde el índice indicado hasta el final de la lista

nombres[3] = 'Liliana' #Modificar un valor de la lista
nombres[0] = 'Natalia'

for nombre in nombres:
    print(nombre)
else:
    print("No hay más elementos en la lista")