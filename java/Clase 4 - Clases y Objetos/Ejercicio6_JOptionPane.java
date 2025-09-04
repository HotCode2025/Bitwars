
package ejercicio6_joptionpane;
import javax.swing.JOptionPane;

public class Ejercicio6_JOptionPane {

    public static void main(String[] args) {
         int numero;
        int suma = 0;
        String entrada;

        do {
            entrada = JOptionPane.showInputDialog("Introduce un número (0 para terminar):");
            // Se asume que el usuario siempre introducirá un número válido
            numero = Integer.parseInt(entrada);
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma de todos los números introducidos es: " + suma);
    }
}
   
