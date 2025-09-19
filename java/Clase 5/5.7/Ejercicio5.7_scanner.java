//Ejercicio 8: Pedir un numero N y mostrar todos los numeros del 1 al N con clase Scanner

package ejercicio5.pkg7;

import java.util.Scanner;

public class Ejercicio57 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Por favor, ingrese un número entero N: ");

      
        int n = entrada.nextInt();

       
        System.out.println("Los números del 1 al " + n + " son:");

        // bucle 'for' para iterar desde 1 hasta 'n'
        for (int i = 1; i <= n; i++) {
            // Imprimir cada número en una nueva línea
            System.out.println(i);
        }

    }
    
}
