# Ejercicio 8: Dadas las horas trabajadas de 5 personas y la tarifa de pago, calcular el salario, y la sumatoria de todos los salarios.
i = 1
suma = 0
while i <= 5:
    print("Empleado", i)
    horas = int(input("Ingrese las horas trabajadas: "))
    tarifa = int(input("Ingrese la tarifa por hora: "))
    salario = horas * tarifa
    print("El salario es: $", salario)
    suma = suma + salario
    i += 1
print("La suma de todos los salarios es:", suma)