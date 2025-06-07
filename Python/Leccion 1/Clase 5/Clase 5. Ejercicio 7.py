#Ejercicio: Tienda de libros
print("Digite los siguientes datos del libro:")
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el envio es gratuito (True/False): ")
if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "Falso":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
print(f'''
        Nombre: {nombre}
        Id: {id}
        Precio: {precio}
        Envio Gratuito?: {envioGratuito} 
''')