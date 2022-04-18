
package lab3.ejercicio3;

import java.util.Scanner;

public class Lab3Ejercicio3 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
        // Fecha ACtual 21/02/2022)
      int anioActual = 2022;
      int mesActual = 02;
      int diaAc = 21;
      
      int anioNac;
      int mesNac;
      int diaNac;
      int respFeca,resMes;
      
        System.out.println("Ingrese La fecha de nacimiento del la persona dia/mes/año");
        
        System.out.print("Ingrese dia Nacimiento: ");
        diaNac = entrada.nextInt();
        
        System.out.print("Ingrese mes Nacimiento: ");
        mesNac = entrada.nextInt();
        
        System.out.print("Ingrese Año Nacimiento: ");
        anioNac = entrada.nextInt();
        
            //2 - 8
        if(diaAc<diaNac){
            diaAc = diaAc + 30; //se le suma los 30 dias (1 mes ) a la fecha actual
            mesActual = mesActual-1; // se le res un mes (30 dias ) al actual
            respFeca = diaAc - diaNac;
        }
        
        
      
      
      
      
      
    }
    
}
