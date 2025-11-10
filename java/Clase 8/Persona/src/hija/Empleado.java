package domain;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    // Constructor
    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        // Llama al constructor de la clase Padre (Persona)
        super(nombre, genero, edad, direccion); 
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    // Métodos Getters y Setters propios de Empleado
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Sobreescribimos el método toString
    @Override
    public String toString() {
        // Primero llamamos al toString() de la clase padre
        return super.toString() + 
               " Empleado{" +
               "idEmpleado=" + idEmpleado +
               ", sueldo=" + sueldo +
               '}';
    }
}