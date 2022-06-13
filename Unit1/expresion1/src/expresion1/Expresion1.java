
package expresion1;

import java.util.Scanner;

public class Expresion1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       double a,b,c,d,res; //1. reservara variables
       
        System.out.print("Ingrese valor de a: "); a= entrada.nextDouble();
        System.out.print("Ingrese valor de b: "); b= entrada.nextDouble();
        System.out.print("Ingrese valor de c: "); c= entrada.nextDouble();
        System.out.print("Ingrese valor de d: "); d= entrada.nextDouble();
        
        res =(a/b)-(c/d);
        
        System.out.println("La respueta es: "+res);
       
    }
    
}
