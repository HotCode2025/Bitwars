package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        long producto = 1;

        for (int i = 1; i <= 10; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa el número impar " + i + ":"));

            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "ese número no es impar, volvé a intentarlo");
                i--; // retrocedemos el contador para que vuelva a pedir el mismo
            } else {
                producto *= numero;
            }
        }

        JOptionPane.showMessageDialog(null, "el producto de los 10 números impares ingresados es: " + producto);
    }
}
