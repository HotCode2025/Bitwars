package test;

//import ar.com.codesystem.*; // Importa todas las clases del paquete (Opción 1)
//import ar.com.codesystem.Utileria; // Importa solo la clase (Opción 2)
import static ar.com.codesystem.Utileria.imprimir; // solo aplica para métodos estáticos (Opción 3)


public class TestUtileria {
    public static void main(String[] args) {
        //Utileria.imprimir("Saludos a todos los alumnos de la tecnicatura"); // Usado con Opción 2
        //imprimir("Terminamos en unos minutos"); // Usado con Opción 3
        
        //Opción 4: Nombre completamente calificado (sin imports)
        ar.com.codesystem.Utileria.imprimir("Ahora si estamos terminando");
    }
}