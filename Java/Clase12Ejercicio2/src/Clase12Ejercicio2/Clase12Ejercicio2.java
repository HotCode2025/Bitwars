
package Clase12Ejercicio2;
import java.util.Scanner;
/*Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,
el usuario debe ingresar el valor de a y el valor de b.
Formula: (a+b)2=a2+b2+2*a*b
Para esto deberán utilizar la clase Math y un método llamado pow  */
public class Clase12Ejercicio2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        double resultado = Math.pow(a + b, 2);

        double aCuadrado = Math.pow(a, 2);
        double bCuadrado = Math.pow(b, 2);
        double dobleProducto = 2 * a * b;

        System.out.println("Resultado de (a + b)^2: " + resultado);
        System.out.println("Verificación: a^2 + b^2 + 2ab = " + (aCuadrado + bCuadrado + dobleProducto));
    }
}
