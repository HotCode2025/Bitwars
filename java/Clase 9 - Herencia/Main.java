import Clase9Proyecto;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un objeto de la clase Cliente
        
        // Se utiliza 'new Date()' para obtener la fecha y hora actual
        Cliente cliente1 = new Cliente(
            "Juan Pérez", 
            'M', 
            35, 
            "Calle Falsa 123", 
            1001, 
            new Date(), // Fecha de registro actual
            true
        );

        // 2. Mostrar la información completa del cliente (gracias al método toString)
        System.out.println("--- Información del Cliente 1 ---");
        System.out.println(cliente1);

        // 3. Acceder a un método heredado de Persona
        System.out.println("\nNombre de Persona (Heredado): " + cliente1.getNombre());
        
        // 4. Acceder a un método propio de Cliente
        System.out.println("Es VIP: " + cliente1.isVip());

        // 5. Usar un setter heredado
        cliente1.setDireccion("Avenida Siempre Viva 742");
        System.out.println("Nueva Dirección: " + cliente1.getDireccion());
        
        // 6. Usar el método adicional de Cliente
        cliente1.registrarVip(false);
        System.out.println("Es VIP después del cambio: " + cliente1.isVip());
    }
}