# ejercicio 8 cajero automatico

saldo = 1000

while True:
    print("\n1. ingresar plata")
    print("2. sacar plata")
    print("3. ver saldo")
    print("4. salir")
    op = input("elige opcion: ")

    if op == "1":
        cant = float(input("cuanto queres meter: "))
        saldo += cant
    elif op == "2":
        cant = float(input("cuanto queres sacar: "))
        if cant <= saldo:
            saldo -= cant
        else:
            print("no alcanza la plata")
    elif op == "3":
        print("saldo:", saldo)
    elif op == "4":
        print("chauu")
        break
    else:
        print("opcion invalida")
