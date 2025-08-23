package pkg2.cicloconjoptionpane;

import javax.swing.JOptionPane;

public class EjercicioCicloConJOptionPane {

    public static void main(String[] args) {
          int numero, cuadrado;
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
          while(numero >= 0) {
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
          }
            System.out.println("El programa ha finalizado por numero negativo");
    }
}