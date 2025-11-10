package ar.com.codesystem.ventas.test;

//import ar.com.codesystem.ventas.*;
import ar.com.codesystem.ventas.Producto;
import ar.com.codesystem.ventas.Orden;
//import java.util.Scanner; // Se agrega y luego se borra en el video

public class VentasTest {
    public static void main(String[] args) {
        // Se usa el nombre de la clase "fully qualified"
        ar.com.codesystem.ventas.Producto producto1 = new ar.com.codesystem.ventas.Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        // Tarea: Agregar más productos
        Producto producto3 = new Producto("Zapatos", 7500.00);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
        
        // Creamos una nueva orden
        Orden orden2 = new Orden();
        Producto producto4 = new Producto("Medias", 2500.00);
        Producto producto5 = new Producto("Short", 4500.00);
        
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        
        System.out.println("\nMostrando orden 2");
        orden2.mostrarOrden();
        
        //Vamos a probar el límite de productos
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto2);
        orden3.agregarProducto(producto3);
        orden3.agregarProducto(producto4);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto2);
        orden3.agregarProducto(producto3);
        orden3.agregarProducto(producto4);
        orden3.agregarProducto(producto5); // Producto 10
        
        // Producto 11 (este debe dar error)
        orden3.agregarProducto(producto3); 
        
        System.out.println("\nMostrando orden 3");
        orden3.mostrarOrden();
    }
}