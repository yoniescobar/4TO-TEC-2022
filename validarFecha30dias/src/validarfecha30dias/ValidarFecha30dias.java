
package validarfecha30dias;

import javax.swing.JOptionPane;

public class ValidarFecha30dias {

    public static void main(String[] args) {
       
        int dia,mes,anio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        
        if((dia>=1)&&(dia<=30)){ //validando el dia entre 1 a 30
            if((mes>=1)&&(mes<=12)){ //validando el mes que este entre 1 al 12
                if(anio!=0){//si año es distinto 0 
                  JOptionPane.showMessageDialog(null,"La fecha es valida");
                }else{
                  JOptionPane.showMessageDialog(null,"Error!! el año debe ser mayor 0");  
                }
            }else{
                 JOptionPane.showMessageDialog(null,"Error!! el mes debe ser entre 1 a 12");
            }
        
        }else{
             JOptionPane.showMessageDialog(null,"Error!! el dia debe ser entre 1 a 30 dias");
        }
        
        
        
    }
    
}
