package domain;

import java.util.Date; // Importamos la clase Date

public class Cliente extends Persona {
    private final int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    // Constructor
    public Cliente(String nombre, char genero, int edad, String direccion, 
                   Date fechaRegistro, boolean vip) {
        // Llama al constructor de la clase Padre (Persona)
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // Métodos Getters y Setters propios de Cliente
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() { // Para boolean se usa "is" en lugar de "get"
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    // Sobreescribimos el método toString
    @Override
    public String toString() {
        return super.toString() +
               " Cliente{" +
               "idCliente=" + idCliente +
               ", fechaRegistro=" + fechaRegistro +
               ", vip=" + vip +
               '}';
    }
}