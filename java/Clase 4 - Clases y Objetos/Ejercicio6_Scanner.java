/*Ejercicio6: Pedir numeros hasta que se teclee un 0,
mostrar la suma de todos los numeros introducidos
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        
        System.out.println("Introduce un número o teclea 0 para terminar):");
        numero = entrada.nextInt();
        
        while (numero != 0) {
            suma += numero;
            System.out.println("Introduce otro número o teclea 0 para terminar):");
            numero = entrada.nextInt();
        }
        
        System.out.println("La suma de todos los números introducidos es: " + suma);
        }
    }

    
    
