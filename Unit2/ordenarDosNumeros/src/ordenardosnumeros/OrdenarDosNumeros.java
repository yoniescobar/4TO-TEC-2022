
package ordenardosnumeros;

import javax.swing.JOptionPane;

public class OrdenarDosNumeros {

    
    public static void main(String[] args) {
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un numero: ")); // 
        n2 = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un numero: ")); // 
        
        
        if(n1>n2){
         JOptionPane.showMessageDialog(null," orden: "+n1+"-"+n2);
        }else if(n1==n2){
          JOptionPane.showMessageDialog(null," Ambos numeros son iguales"+n1+"-"+n2);
        }else{
         JOptionPane.showMessageDialog(null," orden: "+n2+"-"+n1);
        }
        
    }
    
}
