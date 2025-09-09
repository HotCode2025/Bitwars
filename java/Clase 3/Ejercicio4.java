package EjercicioCiclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        // --- Usando Scanner ---
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0;

        System.out.println("=== Usando Scanner ===");
        do {
            System.out.print("Introduce un número (negativo para salir): ");
            numero = sc.nextInt();
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);
        System.out.println("Se introdujeron " + contador + " números.");

        // --- Usando JOptionPane ---
        int num, cont = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (negativo para salir):"));
            if (num >= 0) {
                cont++;
            }
        } while (num >= 0);

        JOptionPane.showMessageDialog(null, "Se introdujeron " + cont + " números.");
    }
}
