
package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
            //Ejercicio 4:  El mayor de dos números (Operador Ternario)
        var entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        double numero1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite otro numero: ");
        double numero2 = Double.parseDouble(entrada.nextLine());
        var resultado = (numero1 > numero2) ? "el primer numero es mayor que el segundo" : "el segundo numero es mayor que el primero";
        System.out.println("Resultado: " + resultado);
        
    }
    
}
