package ciclos12;

import javax.swing.JOptionPane;

public class Ciclos12 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa un número:"));

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "el factorial de " + numero + " es: " + factorial);
    }
}
