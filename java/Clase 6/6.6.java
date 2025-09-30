public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Esther";
        System.out.println("Nombre Persona1: " + persona1.nombre);

        // Llamada correcta al metodo
        cambiarValor(persona1);

        System.out.println("El cambio que hiciste en el nombre es: " + persona1.nombre);

        // Demo: reasignar la referencia dentro del metodo NO afecta al objeto original
        cambiarReferencia(persona1);
        System.out.println("Después de intentar reasignar (cambiarReferencia): " + persona1.nombre);
    }

    public static void cambiarValor(Persona persona) {
        // Esto sí cambia el estado del objeto referenciado
        persona.nombre = "María";
    }

    public static void cambiarReferencia(Persona persona) {
        // Esto solo cambia la referencia LOCAL dentro del metodo,
        // no la referencia del llamador.
        persona = new Persona();
        persona.nombre = "Ana";
    }
}

class Persona {
    public String nombre;
}