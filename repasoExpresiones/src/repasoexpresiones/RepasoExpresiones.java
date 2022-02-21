
package repasoexpresiones;

import java.util.Scanner;

public class RepasoExpresiones {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); //1. clase entrada
       
       int n1,n2,suma; //2. declarar variables 
       
       System.out.println("Ingrese el valor 1: "); //3. Ingresar datos
       n1 = entrada.nextInt();
       System.out.println("Ingrese el valor 2: "); //3. Ingresar datos
       n2 = entrada.nextInt();
        
       suma = n1 + n2;
       
        System.out.println("La respuesta es: "+suma);
       
    
    }
    
}
