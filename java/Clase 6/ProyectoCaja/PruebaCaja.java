
package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        // crear objeto usando el constructor vacío
        Caja caja1 = new Caja();
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundidad = 6;
        int volumen1 = caja1.calcularVolumen();
        System.out.println("El volumen de caja1 es: " + volumen1);

        // crear objeto usando el constructor con parámetros
        Caja caja2 = new Caja(4, 5, 6);
        int volumen2 = caja2.calcularVolumen();
        System.out.println("El volumen de caja2 es: " + volumen2);
    }
}
