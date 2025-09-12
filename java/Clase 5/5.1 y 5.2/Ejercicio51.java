
package ejercicio5.pkg1;

public class Ejercicio51 {
//atributos de la clase
    int a;
    int b;
    
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
}
