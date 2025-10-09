import java.util.Date;
// Nota: Se utiliza 'Date' para simplificar, en un proyecto real se usarían 'LocalDate' o 'LocalDateTime'.

public class Persona {
    // Atributos
    private String nombre;
    private char genero; // 'M' o 'F' (Masculino o Femenino)
    private int edad;
    private String direccion;
    
    // Constructor
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método toString para imprimir la información del objeto
    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", genero=" + genero +
               ", edad=" + edad +
               ", direccion='" + direccion + '\'' +
               '}';
    }
}