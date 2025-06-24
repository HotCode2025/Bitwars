
package Ejercicio2Clase11;
import java.util.Scanner;
public class Ejercicio2Clase11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $100.
       ¿cuál será la cantidad que pagará una persona por su compra?
        */
         double compra, descuento, precioFinal;
        System.out.print("Ingrese el valor total de la compra: ");
        compra = input.nextDouble();
        
        if (compra > 100) {
            descuento = compra * 0.20;
        } else {
            descuento = 0;
        }
        
        precioFinal = compra - descuento;
        System.out.println("El valor a pagar es: $" + precioFinal);
    }
}
