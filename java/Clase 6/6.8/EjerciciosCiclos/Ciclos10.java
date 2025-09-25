package ciclos10;

import javax.swing.JOptionPane;

public class Ciclos10 {
    public static void main(String[] args) {
        int suma = 0;
        int numero;

        // pedir 10 numeros con JOptionPane
        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Ingresa el número " + i + ":");
            numero = Integer.parseInt(input);
            suma += numero;
        }

        // mostrar la suma total
        JOptionPane.showMessageDialog(null, "La suma total de los 10 números es: " + suma);
    }
}
