
package Ejercicio3Clase11;
import java.util.Scanner;
public class Ejercicio3Clase11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       /*
        Leer 2 números:
                                Si son iguales, multiplicarlos.
                                Si el primero es mayor, restarlos.
                                Si no, sumarlos.
        */
        int num1, num2, resultado;
        
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }

        System.out.println("El resultado es: " + resultado);
    }
    
}
