
package ejercicio5.pkg1;


public class PruebaAritmetica {
    public static void main(String[] args) {
      int a=10;//variables locales
      int b=7;
      Ejercicio51 aritmetica1= new Ejercicio51();
      aritmetica1.a =3;
      aritmetica1.b = 7;
      aritmetica1.sumarNumeros();
      
      int resultado= aritmetica1.sumarConRetorno();
      System.out.println("resultado= "+resultado);
      
      resultado= aritmetica1.sumarConArgumentos(12,26);
      System.out.println("Resultado usando argumentos: "+resultado);
      
      System.out.println("aritmetica1 a: "+aritmetica1.a);
      System.out.println("aritmetica1 b: "+aritmetica1.b);
      
      Ejercicio51 aritmetica2 = new Ejercicio51(5,8);
      System.out.println("aritmetica2 a= "+aritmetica2.a);
      System.out.println("aritmetica2 b= "+aritmetica2.b);
      
    }
 
    //creamos otro método
    public static void miMétodo(){
        int a= 10;
        System.out.println("Aquí hay otro método");
    }
}
