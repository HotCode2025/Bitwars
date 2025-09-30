//Ejercicio7: Pedir numeros hasta que se introduzca uno negativo y calcular la media

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        // Declarar las variables
        int numero;
        int suma = 0;
        int contador = 0;
        double media;
        
        // Mensaje inicial para el usuario
        System.out.println("Introduce un número, si se introduce un número negativo termina:");
        
        // Leer el primer número
        numero = entrada.nextInt();
        
        // Bucle para pedir y sumar números mientras no sean negativos
        while (numero >= 0) {
            suma += numero;
            contador++;
            System.out.println("Introduce otro número, si se introduce un número negativo termina:");
            numero = entrada.nextInt();
        }
        
        // Calcular la media solo si se introdujo al menos un número no negativo
        if (contador > 0) {
            media = suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } 
    }
    
}
