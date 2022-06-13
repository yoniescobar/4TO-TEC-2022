
package digitonumero;

import javax.swing.JOptionPane;

public class DigitoNumero {

    
    public static void main(String[] args) {
       int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un numero: ")); // 
        
        if(numero<10){
         JOptionPane.showMessageDialog(null,"El numero tiene 1 digito");
        }
        else if(numero<100){
         JOptionPane.showMessageDialog(null,"El numero tiene 2 digitos");
        }
        else if(numero<1000){
         JOptionPane.showMessageDialog(null,"El numero tiene 3 digitos");
        }
        else if(numero<10000){
         JOptionPane.showMessageDialog(null,"El numero tiene 4 digitos");
        }
        else if(numero<100000){
         JOptionPane.showMessageDialog(null,"El numero tiene 5 digitos");
        }else{
         JOptionPane.showMessageDialog(null,"El numero tiene más de 5 digitos");
        }
        
    }
    
}
