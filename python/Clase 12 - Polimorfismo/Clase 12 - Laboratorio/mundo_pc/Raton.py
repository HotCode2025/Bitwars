from mundo_pc.DispositivoEntrada import DispositivoEntrada

class Raton(DispositivoEntrada):
    def __init__(self, marca, tipo_entrada):
        Raton.contador_ratones += 1
        self.id_raton = Raton.contador_ratones
        super().__init__(marca, tipo_entrada)

    def __str__(self):
        return f"ID: {self.id_raton}, Marca: {self._marca}, Tipo de entrada: {self._tipo_entrada}"

if __name__ == '__main__':
    raton1 = Raton('HP', 'USB')
    print(raton1)
    raton2 = Raton('Acer', 'Bluetooth')
    print(raton2)