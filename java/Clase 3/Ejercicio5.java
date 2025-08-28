package EjercicioCiclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Generar número aleatorio
        int numeroSecreto = (int)(Math.random() * 101);

        // --- Usando Scanner ---
        Scanner sc = new Scanner(System.in);
        int intento, intentos = 0;

        System.out.println("=== Usando Scanner ===");
        do {
            System.out.print("Adivina el número (0-100): ");
            intento = sc.nextInt();
            intentos++;
            if (intento < numeroSecreto) {
                System.out.println("Es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("Es menor");
            }
        } while (intento != numeroSecreto);

        System.out.println("¡Correcto! Adivinaste en " + intentos + " intentos.");

        // --- Usando JOptionPane ---
        int secreto = (int)(Math.random() * 101);
        int guess, tries = 0;

        do {
            guess = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número (0-100):"));
            tries++;
            if (guess < secreto) {
                JOptionPane.showMessageDialog(null, "Es mayor");
            } else if (guess > secreto) {
                JOptionPane.showMessageDialog(null, "Es menor");
            }
        } while (guess != secreto);

        JOptionPane.showMessageDialog(null, "¡Correcto! Adivinaste en " + tries + " intentos.");
    }
}
