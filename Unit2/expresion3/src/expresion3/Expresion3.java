
package expresion3;

import java.util.Scanner;

public class Expresion3 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      double a,b,res;
      
        System.out.print("Ingrese el valor de a: ");
        a= entrada.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b= entrada.nextDouble();
      
        res = Math.sqrt( (Math.pow(a, 2)) + (Math.pow(b, 2))  );
        
        System.out.println("El resultado es: "+res);
        
    }
    
}
