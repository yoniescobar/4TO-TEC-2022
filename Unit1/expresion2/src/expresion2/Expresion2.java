
package expresion2;

import java.util.Scanner;

public class Expresion2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       double a,b,res;
       
        System.out.print("Ingrese el valor para a: ");
        a = entrada.nextDouble();
        System.out.print("Ingrese el valor para b: ");
        b = entrada.nextDouble();

        res = (a/b)+15;
        
        System.out.println("La respuesta es: "+res);
        
    }
    
}
