
package ejercicio5.pkg1;

public class Ejercicio51 {
//atributos de la clase
    int a;
    int b;
    //el constructor es un método especial

    /**
     *
     */
    public Ejercicio51(){ //Constructor 1 vacío
        System.out.println("Se esta ejecutando este constructor numero uno");
    }
    public Ejercicio51(int a, int b){//Constructor 2
        this.a=a;
        this.b=b;
        System.out.println("Se esta ejecutando el constructor 2");
        
    }
    //método, esta vacío, devuelve un mensaje, no retorna nada
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado= "+resultado);
    
    }
    //creamos otro método, retorna un numero
    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }

        int sumarConArgumentos(int i, int i0) {
        int resultado = i + i0;
        return resultado;
    }
}
