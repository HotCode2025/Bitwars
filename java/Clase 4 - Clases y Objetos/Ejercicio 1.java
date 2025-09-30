public class Persona {
    // Atributos de la clase
    String nombre;
    String apellido;
    
    // Metodos de la clase
    public void obtenerInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    
    // Metodo main para ejecutar el programa
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        persona.apellido = "Perez";
        persona.obtenerInformacion();
    }
}