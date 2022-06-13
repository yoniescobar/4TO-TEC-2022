
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        double w,z,pi=3.1416,e=2.7182;
        
        System.out.print("Ingrese el valor de w: ");
        w = entrada.nextDouble();
       
        z = 1/Math.sqrt(2*pi) * Math.pow(e,(-w*2/2));
        
        System.out.println("El valor de z es: "+z);
       
    }
    
}
