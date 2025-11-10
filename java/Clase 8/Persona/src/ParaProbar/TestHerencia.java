package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date; // Importamos Date para crear un cliente

public class TestHerencia {
    public static void main(String[] args) {
        
        // Creamos un objeto Empleado
        // Le pasamos los datos de Persona + los datos de Empleado
        Empleado empleado1 = new Empleado("Ariel", 'M', 32, "Calle Falsa 123", 50000.0);
        System.out.println(empleado1);

        // Creamos un objeto Cliente
        // Le pasamos los datos de Persona + los datos de Cliente
        // new Date() crea una fecha con el día y hora actuales
        Cliente cliente1 = new Cliente("Karla", 'F', 28, "Av. Siempre Viva 742", new Date(), true);
        System.out.println(cliente1);
    }
}