
package ejercicio2_ciclosconjoptionpane;

import javax.swing.JOptionPane;

public class Ejercicio2_CiclosConJOptionPane {

 
    public static void main(String[] args) {
        
        var numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero!=0){
            if(numero>0){
                JOptionPane.showMessageDialog(null,"El numero "+numero+" es POSITIVO");
                
            }
            else{
               JOptionPane.showMessageDialog(null,"El numero "+numero+" es NEGATIVO");
            }
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        JOptionPane.showMessageDialog(null,"El numero "+numero+" finaliza el programa");
    }
    
}
