package caja;

public class Caja {
    // atributos
    int ancho;
    int alto;
    int profundidad;

    // constructor vacío
    public Caja() {
    }

    // constructor con parámetros
    public Caja(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    // método para calcular el volumen
    public int calcularVolumen() {
        return ancho * alto * profundidad;
    }
}
