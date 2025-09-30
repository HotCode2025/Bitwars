
package ejercicio7_conjoptionpane;
import javax.swing.JOptionPane;
public class Ejercicio7_conJOPtionPane {

    public static void main(String[] args) {
           
        int numero;
        int suma = 0;
        int contador = 0;
        double media;
        String entrada;

        do {
            entrada = JOptionPane.showInputDialog("Introduce un número (negativo para terminar):");
            numero = Integer.parseInt(entrada);

            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        // Se verifica si se introdujo al menos un número para evitar la división por cero
        if (contador > 0) {
            media = (double) suma / contador;
            JOptionPane.showMessageDialog(null, "La media de los números introducidos es: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "No se introdujo ningún número no negativo para calcular la media.");
        }
    }
}
