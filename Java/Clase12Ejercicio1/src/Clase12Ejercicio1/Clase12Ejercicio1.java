
package Clase12Ejercicio1;
import java.util.Scanner;
/*Ejercicio 1: Construir un programa que, dado un número total de
//horas, devuelve el número de semanas, días y horas equivalentes.
//Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
6 días y 16 horas  */
public class Clase12Ejercicio1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de horas: ");
        int totalHoras = scanner.nextInt();

        int semanas = totalHoras / 168;
        int horasRestantes = totalHoras % 168;

        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;

        System.out.println(totalHoras + " horas equivalen a:");
        System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas.");
    }
}
