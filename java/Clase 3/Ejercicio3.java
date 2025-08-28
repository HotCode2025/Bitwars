package EjercicioCiclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3{
    public static void main(String[] args) {
        // --- Usando Scanner ---
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("=== Usando Scanner ===");
        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " es par");
                } else {
                    System.out.println(numero + " es impar");
                }
            }
        } while (numero != 0);

        // --- Usando JOptionPane ---
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para salir):"));
            if (num != 0) {
                if (num % 2 == 0) {
                    JOptionPane.showMessageDialog(null, num + " es par");
                } else {
                    JOptionPane.showMessageDialog(null, num + " es impar");
                }
            }
        } while (num != 0);
    }
}
