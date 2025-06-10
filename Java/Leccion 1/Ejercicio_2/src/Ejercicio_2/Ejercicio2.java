
package Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
      /*
    Ejercicio 2: Hacer un programa que calcule e imprima el salario de un empleado,  a
    partir de sus horas semanales
   trabajadas y de su salario por hora
   */
    Scanner scanner = new Scanner(System.in);

        // Pedir las horas trabajadas
        System.out.print("Ingrese las horas trabajadas en la semana: ");
        double horasTrabajadas = scanner.nextDouble();

        // Pedir el salario por hora
        System.out.print("Ingrese el salario por hora: ");
        double salarioPorHora = scanner.nextDouble();

        // Calcular salario semanal
        double salarioSemanal = horasTrabajadas * salarioPorHora;

        // Calcular salario mensual (asumimos 4 semanas por mes)
        double salarioMensual = salarioSemanal * 4;

        // Mostrar resultados
        System.out.println("Salario semanal: $" + salarioSemanal);
        System.out.println("Salario mensual (estimado): $" + salarioMensual);

        scanner.close();
    }
}
