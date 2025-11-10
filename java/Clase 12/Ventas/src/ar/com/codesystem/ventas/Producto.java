package ar.com.codesystem.ventas;

public class Producto {
    //Atributos de la clase
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //Constructor vacío
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    
    //Constructor sobrecargado
    public Producto(String nombre, double precio){
        this(); // Llamamos al constructor vacío
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
}