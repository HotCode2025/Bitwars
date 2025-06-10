
package Ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salarioBase = 1000;
        int comisionPorVenta = 150, cantidadVentas;
        float salarioMensual, precioCarro, porcentajeVenta, totalVenta;

        System.out.print("Digite la cantidad de carros vendidos: ");
        cantidadVentas = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite el precio de un carro: ");
        precioCarro = Float.parseFloat(entrada.nextLine());

        comisionPorVenta *= cantidadVentas;
        totalVenta = precioCarro * cantidadVentas;
        porcentajeVenta = totalVenta * 0.05f;
        salarioMensual = salarioBase + comisionPorVenta + porcentajeVenta;

        System.out.println("\nEl salario mensual es: " + salarioMensual);
    }
}


