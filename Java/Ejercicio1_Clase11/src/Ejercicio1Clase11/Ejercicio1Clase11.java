
package Ejercicio1Clase11;
import java.util.Scanner;
public class Ejercicio1Clase11 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* 
        Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobará
        si su promedio de tres calificaciones es mayor o igual a 70, reprueba en
        caso contrario.
        */
        int nota1, nota2, nota3;
        int promedio;

        System.out.print("Ingresar la primera nota: ");
         nota1 = input.nextInt();

        System.out.print("Ingresar la segunda nota: ");
        nota2 = input.nextInt();

        System.out.print("Ingresar la tercera nota: ");
        nota3 = input.nextInt();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 70) {
            System.out.println("El alumno está aprobado con: " + promedio);
        } 
        else  {
            System.out.println("El alumno está desaprobado con: " + promedio);
        }
     }
}
