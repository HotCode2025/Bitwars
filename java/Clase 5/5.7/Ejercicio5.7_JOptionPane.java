//Ejercicio 8: Pedir un numero N y mostrar todos los numeros del 1 al N con JOptionPane
package ejercicio5.pkg7_joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio57_JOptionPane {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Por favor, ingrese un número entero N:");

        int n = Integer.parseInt(input);

        String resultado = "Los números del 1 al " + n + " son:\n";

        //bucle 'for' para generar la secuencia de números
        for (int i = 1; i <= n; i++) {
            // Añadir cada número a la cadena de texto
            resultado += i + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
        
    }
    
}
