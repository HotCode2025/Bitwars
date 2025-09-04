
/*Leer un numero e indicar si es positivo o negativo. El proceso se repetira
hasta que se introduzca un cero 0*/

package ciclosconclasescanneryconjoptionpane;

import java.util.Scanner;


public class CiclosConClaseScannerYconJOptionPane {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var numero= Integer.parseInt(entrada.nextLine());
        while(numero!=0){
            if(numero>0){
                System.out.println("El número "+numero+" es positivo");
            }
            else{
                System.out.println("El numero "+numero+" es negativo");
            }
            System.out.println("Digite otro numero");
            numero=Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero "+numero+"finaliza el programa");
    }
    
}
